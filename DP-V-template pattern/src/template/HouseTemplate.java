package template;

public abstract class HouseTemplate {
	
	//template method
	//making it final so subclasses can't change it (can't override it)
	public final void BuildHouse() {
		buildFoundations();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}
	
	//hook method, default impl often empty
	private void buildWindows() {
		System.out.println("Slider windows are built");
	}
	
	//abstract methods, must provide impl by concrete classes
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	//concrete methods
	//making private so that concrete class can't override
	private void buildFoundations() {
		System.out.println("Foundations are built");
	}
}
