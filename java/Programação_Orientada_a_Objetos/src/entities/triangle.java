package entities;

public class triangle {
	
	//Usado em "Criando_um_método_para_obtermos_os_benefícios_de_reaproveitamento_e_delegação"

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	
	}

	
}
