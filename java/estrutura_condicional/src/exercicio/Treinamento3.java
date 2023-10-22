package exercicio;

import java.util.Scanner;

public class Treinamento3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a % b == 0) || (b % a ==0)) {
			System.out.println("sao multiplicos");
		}
		else {
			System.out.println("nao sao multiplicos");
		}
		
		sc.close();

	}

}
