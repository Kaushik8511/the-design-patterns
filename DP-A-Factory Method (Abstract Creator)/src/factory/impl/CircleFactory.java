package factory.impl;

import factory.AbstractShapeFactory;
import product.Circle;
import product.Shape;

public class CircleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}

}
