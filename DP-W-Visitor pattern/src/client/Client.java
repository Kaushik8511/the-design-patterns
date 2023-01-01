package client;


import element.Item;
import element.impl.Book;
import element.impl.Fruit;
import visitor.ShoppingCartVisitor;
import visitor.impl.ShoppingCartVisitorImpl;

public class Client {
	
	private static int calculateTotal(Item[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int totalCost = 0;
		
		for(Item item: items) totalCost += item.accept(visitor);
		
		return totalCost;
	}
	
	public static void main(String[] args) {
		
		Item[] items = new Item[] {
				new Book(590, "42324"), new Book(542, "4232"),
				new Fruit(130, "Apple", 6), new Fruit(140, "Orange", 11)
		};
		
		int total = calculateTotal(items);
		
		System.out.println("\nTotal payment is: " + total);
	}
}
