package client;

import collection.NotificationCollection;
import iterator.Iterator;

public class NotificationBar {
	private NotificationCollection notifications;
	
	public NotificationBar(NotificationCollection notifications) {
		this.notifications = notifications;
	}
	
	public void printNotifications() {
		Iterator iterator = notifications.createIterator();
		System.out.println("Notification bar");
		
		while(iterator.hasNext()) {
			Notification notification = (Notification) iterator.next();
			System.out.println(notification.getNotification());
		}
		
		//Case when there is no next in iterator
//		Notification notification = (Notification) iterator.next();
//		System.out.println(notification.getNotification());
	}
}
