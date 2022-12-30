package client;

import java.util.Random;

import factory.RobotFactory;
import flyweight.Robot;

public class Client {
	public static void main(String[] args) throws Exception {
		RobotFactory factory = new RobotFactory();
		
		System.out.println("Extrinsic example");
		Robot myRobot;
		
		for(int i=0; i<3; i++) {
			myRobot = (Robot) factory.getRobot("king");
			myRobot.setColor(getRandomColor());
			myRobot.print();
		}
		
		for(int i=0; i<3; i++) {
			myRobot = (Robot) factory.getRobot("queen");
			myRobot.setColor(getRandomColor());
			myRobot.print();
		}
		
		System.out.println("Total number of distinct objects created: " + factory.totalObjectsCreated());
		
	}
	
	public static String getRandomColor() {
		Random r = new Random();
		
		
		int num = r.nextInt(20);
		
		return (num % 2) == 0 ? "green" : "blue";
	}
}
