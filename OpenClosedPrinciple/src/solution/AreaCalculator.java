package solution;

//we can have shape interface as an arg and 
//dynamically call appropriate area method (run time poly)
public class AreaCalculator {
	public double calArea(Shape shape) {
		return shape.calArea();
	}
}
