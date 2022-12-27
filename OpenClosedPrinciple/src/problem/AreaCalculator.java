package problem;

//Initially we have only rectangle shape
//Now, as we have another shape which is circle
//we have to modify the AreaCalculator class
//we have to add new method.
//Now as the shape increases in the future we have to keep modifying the area class.
//modification
public class AreaCalculator {
	public double calRectangleArea(Rectangle rectangle) {
		return rectangle.getLength() * rectangle.getWidth();
	}
	
	public double calCircleArea(Circle circle) {
		return Math.PI * circle.getRadius() * circle.getRadius();
	}
}
