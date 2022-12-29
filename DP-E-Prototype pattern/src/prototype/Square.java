package prototype;

public class Square extends Shape {

	public Square() {
		type = "SQUARE";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method");
	}

}
