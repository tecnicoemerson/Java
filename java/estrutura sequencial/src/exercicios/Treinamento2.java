package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Treinamento2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		double pi = 3.14159;
		double raio = 2;
		
		double soma = 0;
		soma = valor * raio * pi;
		
		System.out.printf("a = %.4f" , soma);

		sc.close();
	}

}
