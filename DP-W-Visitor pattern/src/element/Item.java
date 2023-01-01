package element;

import visitor.ShoppingCartVisitor;

public interface Item {
	public int accept(ShoppingCartVisitor visitor);
}
