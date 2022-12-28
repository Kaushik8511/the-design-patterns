package client;

import builder.MealBuilder;
import builder.NonVegMeal;
import builder.VegMeal;
import director.Director;
import product.Meal;

public class Main {
	public static void main(String[] args) {
		Director director = new Director();
		
		MealBuilder vegBuilder = new VegMeal();
		MealBuilder nonVegBuilder = new NonVegMeal();
		
		director.construct(vegBuilder);
		Meal veg = vegBuilder.getMeal();
		System.out.println("\n***********Veg meal*********");
		veg.showMeal();
		System.out.println("Total cost: " + veg.totalCost());
		
		director.construct(nonVegBuilder);
		Meal nonVeg = nonVegBuilder.getMeal();
		System.out.println("\n***********Non Veg meal*********");
		nonVeg.showMeal();
		System.out.println("Total cost: " + nonVeg.totalCost());
	}
}
