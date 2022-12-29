package client;

import abstraction.Bike;
import abstraction.Car;
import abstraction.Vehicle;
import implementer.Assemble;
import implementer.Produce;

public class Client {
	public static void main(String[] args) {
		//Vehicle(Abstraction) and the workshop(implementor) are the independent of each other
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}
}
