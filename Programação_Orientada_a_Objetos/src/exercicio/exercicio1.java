package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.EX1;

public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EX1 ex1 = new EX1();
		
		System.out.println("Enter rectangle width and height: ");
		ex1.height = sc.nextDouble();
		ex1.width = sc.nextDouble();
		
		System.out.println(ex1);
		
		
		sc.close();

	}

}
