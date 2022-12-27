package solution;

public class Car extends Vehicle {

	@Override
	public RuntimeException getSpeed() {
		return new RuntimeException();
	}

	@Override
	public int getCubicCapacity() {
		return 0;
	}

	public boolean sHatchBack() {
		return true;
	}

}
