package client;

import builder.BuilderInterface;
import builder.Car;
import builder.MotorCycle;
import director.Director;
import product.Product;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		
		BuilderInterface carBuilder = new Car();
		BuilderInterface motorCycleBuilder = new MotorCycle();
		
		director.construct(carBuilder);
		Product p1 = carBuilder.getVehicle();
		p1.show();
		
		director.construct(motorCycleBuilder);
		Product p2 = motorCycleBuilder.getVehicle();
		p2.show();
	}

}
