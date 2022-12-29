package decorator;

public class ConcreteDecorator1 extends AbstractDecorator{
	
	@Override
	public void doJob() {
		super.doJob();
		
		//add additional responsibility
		System.out.println("I am from concrete decorator 1");
	}
}
