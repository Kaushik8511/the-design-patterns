package creator.impl;

import creator.AbstractShapeFactory;
import product.Rectangle;
import product.Shape;

public class RectangleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}

}
