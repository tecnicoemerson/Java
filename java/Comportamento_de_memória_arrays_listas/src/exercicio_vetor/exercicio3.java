package exercicio_vetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	    System.out.print("Quantas pessoas serao digitadas? ");
	    int n = sc.nextInt();

	    String[] nomes = new String[n];
	    int[] idades = new int[n];
	    double[] alturas = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        alturas[i] = sc.nextDouble();
	    }

		double soma = 0;
	    for (int i=0; i<n; i++) {
	        soma += alturas[i];
	    }
	    
	    double alturamedia = soma / n; 
	    System.out.println();
	    System.out.printf("\nAltura media = %.2f\n", alturamedia);
	  
	    int cont = 0;
	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	cont += 1;
	        }
	    }
	    
	    double percentualMenores = cont * 100.0 / n;
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

	  

		sc.close();

	}

}
