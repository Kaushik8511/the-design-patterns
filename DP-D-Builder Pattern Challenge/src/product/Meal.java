package product;

import java.util.ArrayList;
import java.util.List;

import item.Item;

public class Meal {
	private List<Item> items;

	public Meal() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}

	public double totalCost() {
		double cost = 0;

		for (int i = 0; i < items.size(); i++)
			cost += items.get(i).price();

		return cost;
	}

	public void showMeal() {
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			System.out.println(
					"Item name: " + item.name() + " Packing: " + item.packType().pack() + " price: " + item.price());
		}
	}
}
