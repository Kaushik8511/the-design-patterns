package creator.impl;

import creator.AbstractShapeFactory;
import product.Shape;
import product.Square;

public class SquareFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}

}
