package client;

import context.TV;
import state.Off;

public class Client {

	public static void main(String[] args) {
		//creating tv with initial state as off
		TV myTV = new TV(new Off());
		
		//toggling the state of tv (turning on and off)
		
		myTV.powerButton();
		myTV.powerButton();
		
	}

}
