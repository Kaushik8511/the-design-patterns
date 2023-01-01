package stretegy;

public class PayViaCard implements Payment {
	
	private String number;
	private String name;
	private String cvv;
	private String expiration;
	
	public PayViaCard(String number, String name, String cvv, String expiration) {
		this.number = number;
		this.name = name;
		this.cvv = cvv;
		this.expiration = expiration;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of Rs " + amount + " successful via credit/debit card");
	}

}
