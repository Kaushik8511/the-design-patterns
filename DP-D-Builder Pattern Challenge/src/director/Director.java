package director;

import builder.MealBuilder;

public class Director {
	private MealBuilder builder;
	
	public void construct(MealBuilder mealBuilder) {
		builder = mealBuilder;
		builder.addBurger();
		builder.addColdDrink();
	}
}
