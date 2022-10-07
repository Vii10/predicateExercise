package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> p = new ArrayList<>();
		
		p.add(new Product("Tv", 900.00));
		p.add(new Product("Mouse", 50.00));
		p.add(new Product("Tablet", 350.50));
		p.add(new Product("HD Case", 80.90));

		p.removeIf(x -> x.getValue() >= 100);
		
		for(Product product : p) {
			System.out.println(product);
		}
		
	}

}
