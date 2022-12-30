package handler;

import helper.Currency;

public class Rupee10Dispensor implements DispenseChain{
	
	private DispenseChain next;

	@Override
	public void setNextChain(DispenseChain next) {
		this.next = next;
	}

	@Override
	public void dispense(Currency currency) {
		int amount = currency.getAmount();
		
		if(amount >= 10) {
			currency.setAmount(0);
			System.out.println("The 10 rupees notes: " + (amount / 10));
		}
	}



}
