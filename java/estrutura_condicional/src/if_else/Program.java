package if_else;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		int y = 5;
		
	System.out.println("bom dia");
		
		if(x > 0) {
			System.out.println("boa tarde");
		}
		if(y < 0) {
			System.out.println("boa noite");
		}

		
		
		System.out.println("------------------------------------------");
		
		
		
		int hora;
		
		System.out.println("quantas horas? ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("bom dia");
		}
		else {
			System.out.println("boa tarde");
		}
		
		
		
		System.out.println("------------------------------------------");
		
		
		
		int horas;
		
		System.out.println("quantas horas? ");
		horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.println("bom dia");
		}
		else if(horas <= 18) {
				System.out.println("boa tarde");
			}
			else {
				System.out.println("boa noite");
			}
		
		
		sc.close();
				
	
				
	}

}
