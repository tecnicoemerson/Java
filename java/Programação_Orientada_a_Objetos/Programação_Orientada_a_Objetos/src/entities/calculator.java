package entities;

public class calculator {

	//usado em "aula70"
	
	//VERSAO 2 : classe Calculator com membros de instância
   /*
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
	return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
	return 4.0 * PI * radius * radius * radius / 3.0;
	} */
	
	
	
	
	
	//VERSAO 3: classe Calculator com método estático
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
	return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
	return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
