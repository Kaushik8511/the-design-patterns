package factory;

import product.Animal;
import product.Duck;
import product.Tiger;

public class AnimalFactory {
	public static Animal getAnimal(String animalType) {
		if(animalType == null) return null;
		else if(animalType.equalsIgnoreCase("duck")) return new Duck();
		else if(animalType.equalsIgnoreCase("tiger")) return new Tiger();
		return null;
	}
}
