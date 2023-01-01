package helper;

public class Item {
	private String upc;
	private double price;
	
	public Item(String upc, double price) {
		this.upc = upc;
		this.price = price;
	}

	public String getUpc() {
		return upc;
	}

	public double getPrice() {
		return price;
	}
	
}
