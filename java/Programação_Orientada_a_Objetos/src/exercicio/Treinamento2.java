package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.EX2;

public class Treinamento2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EX2 ex2 = new EX2();
		
		System.out.println("name: ");
		ex2.name = sc.nextLine();
		System.out.println("Gross salary");
		ex2.grossSalary = sc.nextDouble();
		System.out.println("tax: ");
		ex2.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + ex2);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		ex2.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + ex2);
		
		
		sc.close();

	}

}
