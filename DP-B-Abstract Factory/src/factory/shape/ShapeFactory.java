package factory.shape;

import factory.AbstractFactory;
import product.color.Color;
import product.shape.Circle;
import product.shape.Rectangle;
import product.shape.Shape;
import product.shape.Square;

public class ShapeFactory extends AbstractFactory {

	// use getShape method to get the object of type Shape
	@Override
	public Shape getShape(String type) {

		// uses the switch statement many times for the below implementation
		if (type == null)
			return null;
		
		else if (type.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		
		else if (type.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		
		else if (type.equalsIgnoreCase("SQUARE"))
			return new Square();
		
		return null;
	}

	//just the sake of making compiler happy
	//we are violating the interface segregation principle
	@Override
	public Color getColor(String color) {
		return null;
	}
}
