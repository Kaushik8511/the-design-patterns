package client;

import factory.AnimalFactory;
import product.Animal;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = AnimalFactory.getAnimal("duck");
		animal1.eat();
		
		Animal animal2 = AnimalFactory.getAnimal("tiger");
		animal2.eat();
	}

}
