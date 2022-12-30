package factory;

import java.util.HashMap;
import java.util.Map;

import flyweight.Robot;
import flyweight.RobotInterface;

//creates and manages all the flyweight objects
public class RobotFactory {
	Map<String, RobotInterface> robots = new HashMap<String, RobotInterface>();
	
	public int totalObjectsCreated() {
		return robots.size();
	}
	
	public RobotInterface getRobot(String type) throws Exception {
		
		type = type.toLowerCase();
		
		if(robots.containsKey(type)) return robots.get(type);
		
		
		switch (type) {
		case "king":
			System.out.println("Creating new king robot as we dont have any");
			robots.put(type, new Robot("king"));
			break;
		case "queen":
			System.out.println("Creating new queen robot as we dont have any");
			robots.put(type, new Robot("queen"));
			break;
		default:
			throw new Exception("Invalid robot category");
		}
		
		return robots.get(type);
	}
}
