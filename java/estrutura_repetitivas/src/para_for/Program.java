package para_for;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		int n = sc.nextInt();
		
		int soma = 0;
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		
		System.out.println("--------------------------------------");
		
		//contagem
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
			}
		
		
		System.out.println("--------------------------------------");

		//contagem regressiva
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
			}
		
		
		sc.close();

	}

}
