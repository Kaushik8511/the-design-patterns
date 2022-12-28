package factory;

import product.Circle;
import product.Rectangle;
import product.Shape;
import product.Square;

public class ShapeFactory {
	
	//use getShape method to get the object of type Shape
	public static Shape getShape(String shapeType) {
		
		//uses the switch statement many times for the below implementation
		if(shapeType == null) return null;
		else if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		else if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		return null;
	}
}
