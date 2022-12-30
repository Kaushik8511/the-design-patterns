package factory;

import java.util.HashMap;
import java.util.Map;

import flyweight.LargeRobot;
import flyweight.RobotInterface;
import flyweight.SmallRobot;

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
		case "small":
			robots.put(type, new SmallRobot());
			break;
		case "large":
			robots.put(type, new LargeRobot());
			break;
		default:
			throw new Exception("Invalid robot category");
		}
		
		return robots.get(type);
	}
}
