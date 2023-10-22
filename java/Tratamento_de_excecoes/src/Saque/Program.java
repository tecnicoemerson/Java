package Saque;

import java.util.Locale;
import java.util.Scanner;

import Saque_exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();
		Account acc = new Account(number, holder, balance, withDrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withDraw(amount);
			System.out.printf("New balance: " + String.format("%.2f%n", acc.getBalance()));
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}

		
		sc.close();

	}

}
