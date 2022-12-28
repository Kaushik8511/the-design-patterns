package factory;

import product.Animal;
import product.Duck;
import product.Tiger;

public class ConcreteAnimalFactory implements AnimalFactory{
	@Override
	public Animal getAnimal(String animalType) throws Exception {
		if (animalType == null)
			return null;

		switch (animalType.toUpperCase()) {
			case "DUCK":
				return new Duck();
			case "TIGER":
				return new Tiger();
			default:
				throw new Exception(animalType + " is not there!!!");
		}

	}
}
