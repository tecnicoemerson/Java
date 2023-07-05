package Criando_um_método_para_obtermos_os_benefícios_de_reaproveitamento_e_delegação;

import java.util.Locale;
import java.util.Scanner;

import entities.triangle;

public class aula63 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//PARTE 1 SEM ORIENTAÇAO DE OBJETOS
		/*double xA, xB, xC, yA, yB, yC; 
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB+ xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p- xB) * (p - xC));
		
		 p = (yA + yB+ yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p- yB) * (p - yC));
		
		System.out.printf("triangle X area: %.4f%n" , areaX);
		System.out.printf("triangle Y area: %.4f%n" , areaY);

		if(areaX > areaY) {
			System.out.println("larger area: X");
		}
		else {
			System.out.println("larger area: Y");

		}*/
		 
		
		
		//PARTE 2 USANDO ORIENTAÇAO DE OBJETOS
		triangle x, y;
		x = new triangle();
		y = new triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("triangle X area: %.4f%n" , areaX);
		System.out.printf("triangle Y area: %.4f%n" , areaY);

		if(areaX > areaY) {
			System.out.println("larger area: X");
		}
		else {
			System.out.println("larger area: Y");

		}
		
		sc.close();

	}

}
