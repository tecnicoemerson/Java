package sobrecarga;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_sobrecarga;

public class aula77 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Product_sobrecarga p = new Product_sobrecarga();*/  //<======= construtor padrao 
		
		System.out.println("Enter product data: ");  
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		/*System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();*/
		Product_sobrecarga product = new Product_sobrecarga(name, price /*quantity*/);  //<======== sobrecarga
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
	    //quantity = sc.nextInt();
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}