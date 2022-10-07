package entities;

public class Product {
	
	private String name;
	private double value;
	
	public Product(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public boolean staticMethod() {
		return value >= 100;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", value);
	}
}
