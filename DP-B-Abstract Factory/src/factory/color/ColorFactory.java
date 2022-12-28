package factory.color;

import factory.AbstractFactory;
import product.color.Blue;
import product.color.Color;
import product.color.Green;
import product.color.Red;
import product.shape.Shape;

public class ColorFactory extends AbstractFactory {

	// just the sake of making compiler happy
	// we are violating the interface segregation principle
	@Override
	public Shape getShape(String type) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		// uses the switch statement many times for the below implementation
		if (color == null)
			return null;

		else if (color.equalsIgnoreCase("RED"))
			return new Red();

		else if (color.equalsIgnoreCase("GREEN"))
			return new Green();

		else if (color.equalsIgnoreCase("BLUE"))
			return new Blue();

		return null;
	}

}
