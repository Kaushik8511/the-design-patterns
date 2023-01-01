package stretegy;

public class PayViaUPI implements Payment {
	
	private String upiId;
	
	public PayViaUPI(String upiId) {
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of Rs " + amount + " successful via UPI id " + upiId);
	}

}
