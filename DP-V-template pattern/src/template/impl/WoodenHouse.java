package template.impl;

import template.HouseTemplate;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Walls are built in concrete and have wood layer");
		
	}

	@Override
	public void buildPillars() {
		System.out.println("Pillars are built in concrete and have wood layer");		
	}

}
