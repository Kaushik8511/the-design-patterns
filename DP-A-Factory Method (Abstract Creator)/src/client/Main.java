package client;

import creator.impl.CircleFactory;
import creator.impl.RectangleFactory;
import creator.impl.SquareFactory;
import product.Shape;

public class Main {

	public static void main(String[] args) {
		Shape shape1 = new CircleFactory().getShape();
		shape1.draw();
		
		Shape shape2 = new RectangleFactory().getShape();
		shape2.draw();
		
		Shape shape3 = new SquareFactory().getShape();
		shape3.draw();
	}

}
