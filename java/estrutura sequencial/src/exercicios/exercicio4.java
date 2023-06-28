package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valorhora = sc.nextDouble();
		
		double soma = 0;
		soma = horas * valorhora;
		System.out.println("number = " + numero);
		System.out.printf("salary = U$ %.2f" , soma);
		
		sc.close();

	}

}
