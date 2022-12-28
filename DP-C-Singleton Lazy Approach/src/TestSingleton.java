
public class TestSingleton {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		
		//set the data value
		singleton.setData(10);
		
		System.out.println("First reference: " + singleton);
		System.out.println("Singleton data value " + singleton.getData());
		
		//get the another reference;
		singleton = null;
		singleton = Singleton.getInstance();
		
		System.out.println("First reference: " + singleton);
		System.out.println("Singleton data value " + singleton.getData());
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("First reference: " + singleton2);
		System.out.println("Singleton data value " + singleton2.getData());
				
				
	}
}
