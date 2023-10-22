package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.fixa;

public class Treinamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		 fixa.dolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		fixa.quantidade = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n" , fixa.soma());
		
		sc.close();
	}

}
