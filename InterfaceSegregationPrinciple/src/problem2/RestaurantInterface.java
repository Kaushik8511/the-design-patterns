package problem2;

//fat interface
//class implementing this interface will have to implement all the methods 
//irrespective of it uses or not. Just to make compiler happy.
//Any change in this interface will get propagated to all the clients
//whether it is online, walk in or telephone customer

//solution:
//Have two interfaces Order and Payment
//Each client can use appropriate implementations of the above two interfaces.
public interface RestaurantInterface {
	public void acceptOnlineOrder();
	public void takeTelephoneOrder();
	public void payOnline();
	public void walkInCustomerOrder();
	public void payInPerson();
}
