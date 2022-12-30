package handler;

import helper.Currency;

public class Rupee20Dispensor implements DispenseChain{
	
	private DispenseChain next;

	@Override
	public void setNextChain(DispenseChain next) {
		this.next = next;
	}

	@Override
	public void dispense(Currency currency) {
		int rupee20Count = 0;
		int amount = currency.getAmount();
		
		if(amount >= 20) {
			rupee20Count = amount / 20;
			int remAmount = amount % 20;
			currency.setAmount(remAmount);
			System.out.println("The 20 rupees notes: " + rupee20Count);
			if(remAmount > 0) next.dispense(currency);
		}
		else {
			next.dispense(currency);
		}
	}



}
