package solution1;

public class Cube implements ShapeInterface, SolidShape, ManageInterface {

	@Override
	public double volume() {
		
		return 0;
	}

	@Override
	public double area() {
		
		return 0;
	}

	@Override
	public double calculate() {
		return this.area() + this.volume();
	}

}
