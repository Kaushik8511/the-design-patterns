package creator.impl;

import creator.AbstractShapeFactory;
import product.Circle;
import product.Shape;

public class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}

}
