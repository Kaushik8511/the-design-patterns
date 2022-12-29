package prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "RECTANGLE";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method");
	}

}
