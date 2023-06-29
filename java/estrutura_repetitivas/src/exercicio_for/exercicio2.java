package exercicio_for;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			if(i > 10 && i < 20 ) {
				System.out.println(x);
			}
			
		}
		
		
		sc.close();
		
	}

}
