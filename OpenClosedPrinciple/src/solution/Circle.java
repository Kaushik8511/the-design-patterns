package solution;

public class Circle implements Shape {

	private double radius;
	
	@Override
	public double calArea() {
		return Math.PI * radius * radius;
	}

}
