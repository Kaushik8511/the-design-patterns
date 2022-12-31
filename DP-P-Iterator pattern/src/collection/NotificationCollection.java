package collection;

import client.Notification;
import iterator.Iterator;
import iterator.NotificationIterator;

public class NotificationCollection implements Collection {
	private static final int MAX_ITEMS = 6;
	private int numOfItems = 0;
	private Notification[] notifications;
	
	public NotificationCollection() {
		notifications = new Notification[MAX_ITEMS];
		addItem("notification 1");
		addItem("notification 2");
		addItem("notification 3");
		addItem("notification 4");
		addItem("notification 5");
		addItem("notification 6");
		
		//trying to insert after collection got full
//		addItem("notification 7");
//		addItem("notification 8");
//		addItem("notification 9");
	}
	
	public void addItem(String message) {
		
		if(numOfItems >= 6) {
			System.err.println("notifications are full");
			return;
		}
		
		Notification notification = new Notification(message);
		notifications[numOfItems++] = notification;
	}

	@Override
	public Iterator createIterator() {
		return new NotificationIterator(this);
	}

	public static int getMaxItems() {
		return MAX_ITEMS;
	}

	public int getNumOfItems() {
		return numOfItems;
	}

	public Notification[] getNotifications() {
		return notifications;
	}
	
	

}
