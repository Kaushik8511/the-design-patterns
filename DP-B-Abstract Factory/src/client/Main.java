package client;

import factory.AbstractFactory;
import factory.FactoryProducer;
import product.color.Color;
import product.shape.Shape;

public class Main {

	public static void main(String[] args) throws Exception {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Color color2 = colorFactory.getColor("BLUE");
		color2.fill();
	}

}
