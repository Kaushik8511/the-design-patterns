package adaptee;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("gooble gooble!!!");
	}

	@Override
	public void fly() {
		System.out.println("I am flying a short distance");
	}

}
