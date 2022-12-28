package builder;

import product.Product;

//Concrete builder class
//implements the builder interface and build the product as instructed by the director
public class MotorCycle implements BuilderInterface{

	private Product product = new Product();
	
	@Override
	public void buildBody() {
		product.add("This is the body of the motor cycle");
	}

	@Override
	public void insertWheels() {
		product.add("Inserting the wheels into the motor cycle");
	}

	@Override
	public void addHeadLights() {
		product.add("1 headlight is added");
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
