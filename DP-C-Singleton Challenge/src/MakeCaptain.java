
public class MakeCaptain {
	//class attributes
	
	//private constructor
	private MakeCaptain() {}
	
	//private static inner class to instantiate the singleton object
	//class will reference after getCaptain called
	private static class MakeCaptainHelper {
		private static final MakeCaptain _captain = new MakeCaptain();
	}
	
	//get instance method to return singleton instance
	public static MakeCaptain getCaptain() {
		return MakeCaptainHelper._captain;
	}
	
	
	//class operations
	
	//getters and setters
}
