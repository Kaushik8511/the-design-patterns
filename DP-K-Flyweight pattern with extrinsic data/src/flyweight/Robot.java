package flyweight;

public class Robot implements RobotInterface {

	private String type;
	private String color;
	
	public Robot(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClolor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void print() {
		System.out.println("Robot type: " + this.type + ", Robot color: " + this.color);
	}


}
