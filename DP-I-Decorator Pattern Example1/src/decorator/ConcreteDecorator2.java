package decorator;

public class ConcreteDecorator2 extends AbstractDecorator{
	
	@Override
	public void doJob() {
		
		System.out.println("\nStart decorator 2");
		
		super.doJob();
		
		//add additional responsibility
		System.out.println("I am from concrete decorator 2");
	}
}