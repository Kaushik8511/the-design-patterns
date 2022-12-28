package client;

import factory.ShapeFactory;
import product.Shape;

public class Main {

	public static void main(String[] args) {
		Shape shape1 = new ShapeFactory().getShape("Circle");
		shape1.draw();
		
		Shape shape2 = new ShapeFactory().getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = new ShapeFactory().getShape("square");
		shape3.draw();
	}

}
