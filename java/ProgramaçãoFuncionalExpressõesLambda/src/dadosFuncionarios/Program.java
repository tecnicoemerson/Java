package dadosFuncionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entitiesFuncionarios.Employee;
import entitiesFuncionarios.searchFuncionarios;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double avg = sc.nextDouble();
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> names = list.stream()
					.filter(p -> p.getSalary() > avg)
					.map(p -> p.getEmail()).sorted(comp)
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
						
			searchFuncionarios sf = new searchFuncionarios();
			
			double sum = sf.fil(list, p -> p.getName().charAt(0) == 'M');
			System.out.println("Sum of salary of people whose name starts with 'M': "+ String.format("%.2f", sum));
			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}
	
}
