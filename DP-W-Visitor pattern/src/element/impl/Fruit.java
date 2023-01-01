package element.impl;

import element.Item;
import visitor.ShoppingCartVisitor;

public class Fruit implements Item {
	
	private int pricePerKg;
	private String name;
	private int weight;

	public Fruit(int pricePerKg, String name, int weight) {
		this.pricePerKg = pricePerKg;
		this.name = name;
		this.weight = weight;
	}

	
	public int getPricePerKg() {
		return pricePerKg;
	}

	public String getName() {
		return name;
	}


	public int getWeight() {
		return weight;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}


}
