package exercicio;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		double soma = 0;	
		if ( valor1 == 1 ) {
			soma = valor2 * 4.00 ;
		}
		else if (valor1 == 2) {
			soma = valor2 * 4.50 ;
		}
		else if(valor1 == 3) {
			soma = valor2 * 5.00;
		}
		else if(valor1 == 4) {
			soma = valor2 * 2.00;
		}
		else if(valor1 == 5) {
			soma = valor2 * 1.50;
		}
		else {
			soma = valor1 + valor2;
		}
		
		System.out.printf("total: R$%.2f" , soma);
		sc.close();
		

	}

}
