package entities;

public class treina3 {
	
	public String name;
	public double nota1 , nota2, nota3;
	
	public double soma() {
		return nota1 + nota2 + nota3;
	}
	
	
	public double notafinal(){
		 if(soma() < 60.0) {
			return 60.0 - soma();
			}
		 else {
			 return 0.0;
		 }
	}
	
	
}
