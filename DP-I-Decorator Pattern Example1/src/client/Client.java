package client;

import component.ConcreteComponent;
import decorator.ConcreteDecorator1;
import decorator.ConcreteDecorator2;

public class Client {
	public static void main(String[] args) {
		ConcreteComponent cc = new ConcreteComponent();
		
		ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1();
		concreteDecorator1.setComponent(cc);
		concreteDecorator1.doJob();
		
		System.out.println("\n\n\nSecond one");
		
		ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2();
		concreteDecorator2.setComponent(concreteDecorator1);
		concreteDecorator2.doJob();
	}
}
