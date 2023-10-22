package exercicio;

import java.util.Scanner;

public class Treinamento4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
	        int instanteInicial = valor1 * 60 ;
	        int instanteFinal = valor2 * 60 ;
	        int duracao;
	        if (instanteInicial < instanteFinal) {
	            duracao = instanteFinal - instanteInicial;
	        }
	        else {
	            duracao = (24 * 60 - instanteInicial) + instanteFinal;
	        }
	        int duracaoHoras = duracao / 60;
	        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S)");
		
		sc.close();

	}

}
