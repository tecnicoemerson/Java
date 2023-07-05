package Membros_estáticos;

import java.util.Locale;
import java.util.Scanner;

import entities.calculator;

public class aula70 {

	 // VERSAO 1: métodos na própria classe do programa
	/*               
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
		
		}
		public static double circumference(double radius) {
		return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		
	} */

	
	
	
	
	 //VERSAO 2: classe Calculator com membros de instância
	/*
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		calculator calc = new calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
	*/
	
	
	
	
	
	//VERSAO 3: classe Calculator com método estático
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circumference(radius);
		
		double v = calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);
		
		sc.close();
	}
}
