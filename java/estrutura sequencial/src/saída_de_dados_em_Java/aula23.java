package saída_de_dados_em_Java;

import java.util.Locale;

public class aula23 {

	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		System.out.println("ola mundo!");
		System.out.println("bom dia");
		
		
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		
		System.out.printf("%.2f\n", x);
		// ou
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		
		System.out.println("Resultado = " + x + "metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.println("--------------------------------------");
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
