
/**
 * THREAD SAFE
 * BUT CREATES THE OBJECT EVEN THOUGH CLIENT DOESN'T USE IT
 * @author kaushik
 *
 */

public class Singleton {

	// private reference to one and only one instance
	private static Singleton onlyInstance = new Singleton();

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
		//we already got the instance so just simply return it
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
