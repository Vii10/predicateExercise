package util;

import java.util.function.Predicate;

import entities.Product;

public class PredicateImp implements Predicate<Product>{

	@Override
	public boolean test(Product product) {
		return product.getValue() >= 100; //Pega o valor e calcula se ele é maior do que 100. Se for, ele separa esses itens
	}
}
