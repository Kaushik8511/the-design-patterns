package flyweight;

public interface RobotInterface {
	
	void print();
	
	//will pass extrinsic data via argument to the below method
	//extrinsic data implies that all the objects are not the same
	//It has some data that is different
	//In this case we can't return cached object
	//we have to create new object and return that
	public void setColor(String color);
}
