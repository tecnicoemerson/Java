package entities;

public class Product_sobrecarga {
	public String name;
	public double price;
	public int quantity;
	
	public Product_sobrecarga() {       //<======= construtor padrao manualmente
	}

	public Product_sobrecarga(String name,  double price, int quantity) {  
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product_sobrecarga(String name,  double price) {  // <========== sobrecarga
		this.name = name;
		this.price = price;
		quantity = 0;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}