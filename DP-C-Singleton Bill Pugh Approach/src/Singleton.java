
/**
 * THREAD SAFE
 * ONLY CREATES INSTANCE WHEN IT IS GETTING USED
 * BEST APPROACH THAN ALL OTHER FOUR APPROACHES
 * 
 * @author kaushik
 *
 */

public class Singleton {

	// instance attribute
	private int data = 0;

	/**
	 * singleton constructor It is private so that no class can instantiate the
	 * Singleton class
	 */
	private Singleton() {
	}

	//Nested private helper class
	//referenced after getInstance method called
	//When singleton class gets loaded singletonHelper class won't get loaded
	//It will only get loaded when the getInstance method will get called
	private static class SingletonHelper {
		private static final Singleton onlyInstance = new Singleton();
	}
	
	// get instance method
	public static Singleton getInstance() {
		return SingletonHelper.onlyInstance;
	}
	
	//add setter methods to set the data
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}

}
