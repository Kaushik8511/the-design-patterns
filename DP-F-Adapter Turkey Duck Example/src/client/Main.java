package client;

import adaptee.WildTurkey;
import adapter.TurkeyAdapter;
import target.Duck;
import target.MallerDuck;

public class Main {

	public static void main(String[] args) {
		MallerDuck mallerDuck = new MallerDuck();
		
		WildTurkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		
		System.out.println("The turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("\nThe duck says...");
		testDuck(mallerDuck);
		
		System.out.println("\nThe turkey adapted duck says");
		testDuck(turkeyAdapter);
		
	}

	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
