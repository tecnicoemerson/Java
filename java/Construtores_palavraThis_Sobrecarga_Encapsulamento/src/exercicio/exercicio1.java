package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.EX1;

public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EX1 ex1;
	
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String op = sc.nextLine();
		double deposito = 0;
		if(op.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			deposito = sc.nextDouble();
			  ex1 = new EX1(number,name,deposito);
		}else {
			  ex1 = new EX1(number,name);
		}
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.println(ex1);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		ex1.addDeposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(ex1);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		deposito = sc.nextDouble();
		ex1.removeDeposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(ex1);
		sc.close();

	}

}
