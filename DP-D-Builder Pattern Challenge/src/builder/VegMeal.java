package builder;

import item.Coke;
import item.VegBurger;
import product.Meal;

public class VegMeal implements MealBuilder {

	private Meal meal = new Meal();
	
	@Override
	public void addBurger() {
		meal.addItem(new VegBurger());
	}

	@Override
	public void addColdDrink() {
		meal.addItem(new Coke());
	}
	
	@Override
	public Meal getMeal() {
		return meal;
	}

}
