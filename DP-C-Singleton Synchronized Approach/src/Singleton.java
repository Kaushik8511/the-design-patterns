
/**
 * IT HAS THE PERFORMANCE ISSUES AS ALL THREADS HAVE TO WAIT UNTIL ANOTHER THREAD GETS THE SINGETON
 * DUE TO SYNCHRONIZED METHOD
 * SINGLETON OBJECT WILL BE NULL ONCE ONLY
 * AFTER THE OBJECT IS CREATED NO NEED TO WORRY ABOUT RACE CONDITION HENCE NO NEED OF SYNCHRNIZATION.
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
	//by adding synchronized keyword we are making singleton thread safe
	//No race conditions
	public synchronized static Singleton getInstance() {
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
