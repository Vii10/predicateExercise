package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> p = new ArrayList<>();
		
		p.add(new Product("Tv", 900.00));
		p.add(new Product("Mouse", 50.00));
		p.add(new Product("Tablet", 350.50));
		p.add(new Product("HD Case", 80.90));
		
		double value = 100;
		Predicate<Product> prod = x -> x.getValue() >= value;
		
		p.removeIf(prod);
		
		for(Product product : p) {
			System.out.println(product);
		}
		
	}

}
