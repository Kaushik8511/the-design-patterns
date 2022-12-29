package client;

import adaptee.Triangle;
import adapter.CalculatorAdaptor;
import target.CalculatorInterface;

public class Main {

	public static void main(String[] args) {
		System.out.println("We are using Adapter pattern");
		
		Triangle t = new Triangle(10, 10);
		CalculatorInterface calculatorAdaptor = new CalculatorAdaptor(t);
		System.out.println("The area of the triangle is: " + calculatorAdaptor.getArea(null));
		
	}
}
