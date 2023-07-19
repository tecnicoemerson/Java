package exercicio_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex_list;

public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    List<ex_list> list = new ArrayList<>();
		
	    System.out.print("How many rooms will be rented? ");
	    int n = sc.nextInt();
	    
	    for (int i=1; i<=n; i++) {
	    	System.out.println();
	    	System.out.println("Emplyoee #" + i + ":");
	    	System.out.print("Id: ");
	    	Integer id = sc.nextInt();
	    	while(hasId(list,id)) {       // nao permite digitar o mesmo id
	    		System.out.println("id already taken! Try again: ");
	    		id = sc.nextInt();
	    	}
	    	
	    	System.out.print("Name: ");
	        sc.nextLine();
	        String name = sc.nextLine();
	        System.out.print("Salary: ");
	        Double salary = sc.nextDouble();
	            
	        list.add(new ex_list(id, name, salary)); 
	    }
	    	    
	    System.out.println();
	   System.out.print("Enter the employee id that will have salary increase : ");
	   int idSalary = sc.nextInt();
	   
	   ex_list ex = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);   // ver se o id existe na lista
	   //Integer pos = positionId(list, idSalary);       <==== metodo 1 manualmente
	   if(ex == null) {
		   System.out.println("This id does not exist!");
	   }else {
		   System.out.println("Enter the percentage: ");
		   double percent = sc.nextDouble();
		 //list.get(pos).increaseSalary(percent);   <==== metodo 1 manualmente
		   ex.increaseSalary(percent);
	   }
	   	
	   System.out.println();
	    System.out.println("List of employees: ");
	    for(ex_list e : list) {
	    	System.out.print(e);
	    }
	    
	    sc.close();
	    
	}
	
	public static boolean hasId(List<ex_list> list, int id) {       //procura o id pra ver se esta na lista
		ex_list ex = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return ex != null;
	}
	
	/*          
	public static Integer positionId(List<ex_list> list, int id) {           <==== metodo 1 manualmente
 		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id ) {
				return i;
			}
		}
		return null;
	}*/   

}
