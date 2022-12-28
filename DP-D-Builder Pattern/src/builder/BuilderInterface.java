package builder;

import product.Product;

//builder interface which gives the parts to be created in the concrete builder classes
public interface BuilderInterface {
	void buildBody();
	void insertWheels();
	void addHeadLights();
	Product getVehicle();
}
