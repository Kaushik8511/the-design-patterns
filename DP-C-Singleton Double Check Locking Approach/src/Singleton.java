
/**
 * SINGLETON OBJECT WILL BE NULL ONCE ONLY AFTER THE OBJECT IS CREATED NO NEED
 * TO WORRY ABOUT RACE CONDITION HENCE NO NEED OF SYNCHRNIZATION.
 * 
 * @author kaushik
 *
 */

public class Singleton {

	// private reference to one and only one instance
	private volatile static Singleton onlyInstance = null;

	// instance attribute
	private int data = 0;

	/**
	 * singleton constructor It is private so that no class can instantiate the
	 * Singleton class
	 */
	private Singleton() {
	}

	// get instance method
	// by adding synchronized keyword we are making singleton thread safe
	// No race conditions
	public static Singleton getInstance() {

		if (onlyInstance == null) {
			// we only synchronize the first time
			synchronized (Singleton.class) {
				if (onlyInstance == null)
					onlyInstance = new Singleton();
			}
		}
		return onlyInstance;
	}

	// add setter methods to set the data
	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

}
