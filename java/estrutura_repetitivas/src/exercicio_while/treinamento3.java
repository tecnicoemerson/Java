package exercicio_while;

import java.util.Scanner;

public class treinamento3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				alcool += 1;
			}
			else if (x == 2) {
				gasolina += 1;
			}
			else if (x == 3) {
				diesel += 1;
			}
			
			x = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
