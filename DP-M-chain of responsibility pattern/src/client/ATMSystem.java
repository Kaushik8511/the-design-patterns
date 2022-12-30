package client;

import java.util.Scanner;

import handler.DispenseChain;
import handler.Rupee10Dispensor;
import handler.Rupee20Dispensor;
import handler.Rupee50Dispensor;
import helper.Currency;

public class ATMSystem {
	
	private DispenseChain chain;
	
	public ATMSystem() {
		//Initialize the chain
		//most important thing in this design pattern is ordering the request handlers
		this.chain = new Rupee50Dispensor();
		DispenseChain chain1 = new Rupee20Dispensor();
		DispenseChain chain2 = new Rupee10Dispensor();
		chain.setNextChain(chain1);
		chain1.setNextChain(chain2);
	}
	
	public static void main(String[] args) {
		//If amount is not multiple of 10 throw an exception
		ATMSystem atmSystem = new ATMSystem();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int amount = 0;
			System.out.println("Enter amount to withdraw: ");
			amount = scanner.nextInt();
			if(amount % 10 != 0) {
				System.out.println("Amount is not multiple of 10");
				return;
			}
			//process the request
			atmSystem.chain.dispense(new Currency(amount));			
		}
	}
}
