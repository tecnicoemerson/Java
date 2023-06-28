package entrada_de_dados_em_java_parte1;

import java.util.Locale;
import java.util.Scanner;

public class aula25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("voce digitou: " + x);
		
		System.out.println("--------------------------------------");

		int y;
		y = sc.nextInt();
		System.out.println("voce digitou: " + y);
		
		System.out.println("--------------------------------------");
		
		double w;
		w = sc.nextDouble();
		System.out.printf("voce digitou: %.2f%n" , w);
		
		System.out.println("--------------------------------------");
		
		char z;
		z = sc.next().charAt(0);
		System.out.println("voce digitou: " + z);
		
		System.out.println("--------------------------------------");

		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();

	}

}
