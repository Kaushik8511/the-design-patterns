package visitor.impl;

import element.impl.Book;
import element.impl.Fruit;
import visitor.ShoppingCartVisitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

	@Override
	public int visit(Book book) {
		int cost = 0;
		
		if(book.getPrice() > 500) 
			cost = book.getPrice() - 50;
		else cost = book.getPrice();
		System.out.println("Book isbnNumber: " + book.getIsbnNumber() + " price: " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit name: " + fruit.getName() + " Total cost: " + cost);
		return cost;
	}

}
