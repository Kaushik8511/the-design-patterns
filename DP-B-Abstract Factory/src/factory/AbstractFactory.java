package factory;

import product.color.Color;
import product.shape.Shape;

//we are violating the interface segregation principle here
//But just to understand the abstract factory pattern it is ok for now
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
