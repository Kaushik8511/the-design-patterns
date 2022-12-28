package client;

import factory.AnimalFactory;
import factory.ConcreteAnimalFactory;
import product.Animal;

public class Main {

	public static void main(String[] args) throws Exception {
		
		AnimalFactory animalFactory = new ConcreteAnimalFactory();
		
		Animal animal1 = animalFactory.getAnimal("Duck") ;
		animal1.eat();
		
		Animal animal2 = animalFactory.getAnimal("Tiger");
		animal2.eat();
		
		Animal animal3 = animalFactory.getAnimal("Lion");
		animal3.eat();
	}

}
