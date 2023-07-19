package desafios;

import java.util.Locale;
import java.util.Scanner;

import entities.df_vetor;

public class desafio_vetor {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		df_vetor[] vect = new df_vetor[10];   
		
	    System.out.print("How many rooms will be rented? ");
	    int n = sc.nextInt();
	    
	    for (int i=1; i<=n; i++) {
	    	System.out.println();
	    	System.out.print("Rent #" + i + ":");
	    	System.out.print("Nome: ");
	        String nomes = sc.next();
	        sc.nextLine();
	        System.out.print("Email: ");
	        String email = sc.nextLine();
	        System.out.print("Room: ");
	        int room = sc.nextInt();
	           
	        vect[room] = new df_vetor(nomes, email);
	    }
	    
        System.out.println();
	    System.out.println("Busy rooms:");
	    for (int i=0; i<10; i++) {
	    	if(vect[i] != null) {
	    		System.out.println(i + ": " + vect[i]);
	    	}
	    }
	    
	    sc.close();

	}

}
