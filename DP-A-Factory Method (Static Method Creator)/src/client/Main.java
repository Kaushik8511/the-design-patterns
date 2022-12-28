package client;

import factory.ShapeFactory;
import product.Shape;

public class Main {

	public static void main(String[] args) {
		Shape shape1 = ShapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = ShapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = ShapeFactory.getShape("square");
		shape3.draw();
	}

}
