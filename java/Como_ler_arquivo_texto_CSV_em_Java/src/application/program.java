package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;



public class program {

	public static void main(String[] args) {
	
//METODO 1	
		
	/*	File file = new File("/home/emerson/Documentos/in.txt");
		Scanner sc = null;
		try {
			 sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
		    }
		}     */
		
//METODO 2
		
	/*	String path = "/home/emerson/Documentos/in.txt" ;
		FileReader fr = null;
		BufferedReader br = null;
				
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				br.close();
				fr.close();
			}
			
			catch (IOException e) {
				e.getStackTrace();
			}
		}    */
		
		
//METODO 3
			
		/*	String path = ""/home/emerson/Documentos/in.txt" ;
	
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	
				String line = br.readLine();
				while (line != null) {
					System.out.println(line);
					line = br.readLine();
				}
	
			} 
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		*/
		
//METODO 3 utilizado
		
		String path = "/home/emerson/Documentos/in.txt" ;
		
		List<Product> list = new ArrayList<>();
				
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			line = br.readLine();
			while(line != null) {
				
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer quantity = Integer.parseInt(vect[2]);
				
				Product pro = new Product(name, price, quantity);
				list.add(pro);
				
				line = br.readLine();
			}
			
			System.out.println("Products:");
			for(Product p : list) {
				System.out.println(p);
			}
			
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
