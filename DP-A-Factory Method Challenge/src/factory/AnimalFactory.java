package factory;

import product.Animal;

public interface AnimalFactory {
	public Animal getAnimal(String animalType) throws Exception;
}
