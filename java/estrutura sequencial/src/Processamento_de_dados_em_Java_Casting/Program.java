package Processamento_de_dados_em_Java_Casting;

public class Program {

	public static void main(String[] args) {
		
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("--------------------------------------");
		
		int a;
		double c;
		a = 5;
		c = 2 * a;
		System.out.println(a);
		System.out.println(c);
		
		System.out.println("--------------------------------------");

		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);

		System.out.println("--------------------------------------");

		int e, f;
		double resultado;
		e = 5;
		f = 2;
		resultado = (double) e / f;
		System.out.println(resultado);
		
		System.out.println("--------------------------------------");

		double o;
		int u;
		o = 5.0;
		u = (int) o;
		System.out.println(u);
		
	}

}
