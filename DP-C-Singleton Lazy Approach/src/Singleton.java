
/**
 * NOT THREAD SAFE
 * @author kaushik
 *
 */

public class Singleton {

	// private reference to one and only one instance
	private static Singleton onlyInstance = null;

	// instance attribute
	private int data = 0;

	/**
	 * singleton constructor It is private so that no class can instantiate the
	 * Singleton class
	 */
	private Singleton() {
	}

	// get instance method
	public static Singleton getInstance() {
		if (onlyInstance == null)
			onlyInstance = new Singleton();
		return onlyInstance;
	}
	
	//add setter methods to set the data
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}

}
