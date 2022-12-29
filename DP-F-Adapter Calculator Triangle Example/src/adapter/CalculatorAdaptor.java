package adapter;

import adaptee.Triangle;
import target.Calculator;
import target.CalculatorInterface;
import target.Rectangle;

public class CalculatorAdaptor implements CalculatorInterface {

	Calculator calculator;
	Triangle t;
	
	public CalculatorAdaptor(Triangle triangle) {
		t = triangle;
	}
	
	//adapter method
	@Override
	public double getArea(Rectangle rectangle) {
		calculator = new Calculator();
		Rectangle r = new Rectangle();
		r.setLength(t.getBase());
		r.setWidth(t.getHeight() * 0.5);
		return calculator.getArea(r);
	}

}
