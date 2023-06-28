package exercicio;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}
		
		sc.close();
		

	}

}
