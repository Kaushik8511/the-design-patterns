package target;

public class MallerDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("quack quack....");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

}
