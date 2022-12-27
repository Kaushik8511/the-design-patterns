package solution;

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	@Override
	public double calArea() {
		return length * width;
	}

}
