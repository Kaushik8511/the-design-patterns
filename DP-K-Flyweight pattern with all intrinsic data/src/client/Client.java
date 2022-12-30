package client;

import factory.RobotFactory;
import flyweight.RobotInterface;

public class Client {
	public static void main(String[] args) throws Exception {
		RobotFactory factory = new RobotFactory();
		
		RobotInterface robot = factory.getRobot("SMALL");
		robot.print();
		
		RobotInterface robot1 = factory.getRobot("small");
		
		System.out.println(robot == robot1);
		
		RobotInterface robot2 = factory.getRobot("Large");
		RobotInterface robot3 = factory.getRobot("LArgE");
		robot3.print();
		
		System.out.println(robot2 == robot3);
		System.out.println(robot == robot2);
		
		System.out.println(factory.totalObjectsCreated());
	}
}
