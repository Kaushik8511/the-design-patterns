package client;

import template.HouseTemplate;
import template.impl.GlassHouse;
import template.impl.WoodenHouse;

public class Client {

	public static void main(String[] args) {
		//creating wooden house using house template
		HouseTemplate houseType = new WoodenHouse();
		
		//calling house creating template method
		houseType.BuildHouse();
		
		//creating glass house using house template
		houseType = new GlassHouse();
		
		//calling house creating template method
		houseType.BuildHouse();
	}

}
