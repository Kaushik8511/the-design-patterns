package factory;

import product.Shape;

public abstract class AbstractShapeFactory {

	protected abstract Shape factoryMethod();

	public Shape getShape() {
		return factoryMethod();
	}
}
