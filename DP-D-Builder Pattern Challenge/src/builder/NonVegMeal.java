package builder;

import item.ChickenBurger;
import item.Pepsi;
import product.Meal;

public class NonVegMeal implements MealBuilder {

	private Meal meal = new Meal();
	
	@Override
	public void addBurger() {
		meal.addItem(new ChickenBurger());
	}

	@Override
	public void addColdDrink() {
		meal.addItem(new Pepsi());
	}
	
	@Override
	public Meal getMeal() {
		return meal;
	}

}
