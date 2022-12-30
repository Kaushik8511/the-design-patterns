package handler;

import helper.Currency;

public interface DispenseChain {
	void setNextChain(DispenseChain next);
	void dispense(Currency currency);
}
