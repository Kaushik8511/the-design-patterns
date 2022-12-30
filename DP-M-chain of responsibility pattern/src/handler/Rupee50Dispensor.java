package handler;

import helper.Currency;

public class Rupee50Dispensor implements DispenseChain{
	
	private DispenseChain next;

	@Override
	public void setNextChain(DispenseChain next) {
		this.next = next;
	}

	@Override
	public void dispense(Currency currency) {
		int rupee50Count = 0;
		int amount = currency.getAmount();
		
		if(amount >= 50) {
			rupee50Count = amount / 50;
			int remAmount = amount % 50;
			currency.setAmount(remAmount);
			System.out.println("The 50 rupees notes: " + rupee50Count);
			if(remAmount > 0) next.dispense(currency);
		}
		else {
			next.dispense(currency);
		}
	}



}
