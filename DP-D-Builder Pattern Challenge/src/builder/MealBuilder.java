package builder;

import product.Meal;

public interface MealBuilder {
	void addBurger();
	void addColdDrink();
	Meal getMeal();
}
