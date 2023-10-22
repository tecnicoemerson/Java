package entities;

public class treina1 {

	private int number;
	private String name;
	private double deposito;
	
	public EX1(int number,String name, double deposito) {
		this.number = number;
		this.name = name;
		this.deposito = deposito;
		deposito = 0;
	}
	
	public EX1(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public void addDeposito(double deposito) {
		this.deposito += deposito;
	}

	public void removeDeposito(double deposito) {
		this.deposito -= deposito + 5.00;
	}
	
	public String toString() {
		return "Account " 
	+ number 
	+ ", Holder: "
	+ name 
	+ ", Balance: $ "  
	+ String.format("%.2f", deposito);
	}
	
}
