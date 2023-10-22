package exercicio;

import java.util.Scanner;

public class Treinamento1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		if(valor > 0) {
			System.out.println("nao negativo");
		}
		else {
			System.out.println("negativo");
		}
		
		sc.close();

	}

}
