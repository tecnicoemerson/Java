package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.EX3;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EX3 ex3 = new EX3();
		
		ex3.name = sc.nextLine();
		ex3.nota1 = sc.nextDouble();
		ex3.nota2 = sc.nextDouble();
		ex3.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", ex3.soma());
		if (ex3.soma() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", ex3.notafinal());
		}
		else {
		System.out.println("PASS");
		}
		
		
		sc.close();

	}

}
