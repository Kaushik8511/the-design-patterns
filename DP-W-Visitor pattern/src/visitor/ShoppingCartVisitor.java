package visitor;

import element.impl.Book;
import element.impl.Fruit;

public interface ShoppingCartVisitor {
	public int visit(Book book);
	public int visit(Fruit fruit);
}
