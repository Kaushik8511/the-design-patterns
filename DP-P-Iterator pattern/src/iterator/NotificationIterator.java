package iterator;

import collection.NotificationCollection;

public class NotificationIterator implements Iterator {
	
	private NotificationCollection notificationCollection;
	private int position = 0;
	
	public NotificationIterator(NotificationCollection notificationCollection) {
		this.notificationCollection = notificationCollection;
	}

	@Override
	public boolean hasNext() {
		if(position < notificationCollection.getNumOfItems()) return true;
		return false;
	}

	@Override
	public Object next() {
		if(!hasNext()) {
			System.err.println("No next element");
			return null;
		}
		
		Object result = (Object) notificationCollection.getNotifications()[position++];
		return result;
	}

}
