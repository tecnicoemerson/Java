package exercicios;

import java.util.Scanner;

public class Treinamento1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = 0;
		soma = valor1 + valor2;
		
		System.out.println("soma = " + soma);
		
		sc.close();

	}

}
