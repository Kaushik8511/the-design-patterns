package director;

import builder.BuilderInterface;

public class Director {
	//has the instance of the builder
	//it will call the different assembler parts step by step and creates the object
	private BuilderInterface myBuilder;

	//construct the object step by step
	public void construct(BuilderInterface builder) {
		myBuilder = builder;
		myBuilder.buildBody();
		myBuilder.insertWheels();
		myBuilder.addHeadLights();
	}
}
