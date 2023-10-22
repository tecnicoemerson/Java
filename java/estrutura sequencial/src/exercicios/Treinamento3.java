package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Treinamento3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int soma = 0;
		soma = a * b - c * d;
		
		System.out.println("diferença = " + soma);
		
		sc.close();
		
	}

}
