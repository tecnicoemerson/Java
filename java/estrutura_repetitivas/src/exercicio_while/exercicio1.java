package exercicio_while;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 2002) {
			System.out.println("senha invalida");
			x = sc.nextInt();
		}
		
		System.out.println("acesso permitido");
		
		sc.close();

	}

}
