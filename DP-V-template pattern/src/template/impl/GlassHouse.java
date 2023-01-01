package template.impl;

import template.HouseTemplate;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Walls are built in concrete and have glass layer");
		
	}

	@Override
	public void buildPillars() {
		System.out.println("Pillars are built in concrete and have glass layer");		
	}

}
