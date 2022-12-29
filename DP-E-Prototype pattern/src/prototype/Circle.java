package prototype;

public class Circle extends Shape {

	public Circle() {
		type = "CIRCLE";
	}
	
	@Override
	void draw() {
		System.out.println("Inside the Circle::draw() method");
	}

}
