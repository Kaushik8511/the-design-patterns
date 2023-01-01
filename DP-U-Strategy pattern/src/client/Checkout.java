package client;

import context.ShoppingCart;
import helper.Item;
import stretegy.PayViaCard;
import stretegy.PayViaUPI;

public class Checkout {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Item("1232", 432.78));
		cart.addItem(new Item("123432232", 2442.21));
		cart.addItem(new Item("dsfa", 4232.32));
		cart.addItem(new Item("3242", 1232.23));
		
		//payment via card
		cart.pay(new PayViaCard("3213254343", "Hasranga Govinda", "213", "12/24"));
		
		//OR payment via upi
		cart.pay(new PayViaUPI("4243534@daw"));
	}

}
