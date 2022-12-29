package abstraction;

import implementer.Workshop;

public class Bike extends Vehicle {

	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Bike");
		workshop1.work();
		workshop2.work();
	}

}
