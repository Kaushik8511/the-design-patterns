package context;

import java.util.ArrayList;
import java.util.List;

import helper.Item;
import stretegy.Payment;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public double totalCost() {
		double cost = 0;
		
		for(Item item: items) cost += item.getPrice();
		
		return cost;
	}
	
	public void pay(Payment method) {
		double cost = totalCost();
		method.makePayment(cost);
	}
}
