package subject;

import observer.Observer;

public interface Subject {
	//to subscribe the observer to the subject
	public void attach(Observer observer);
	
	//to un-subscribe observer from the subject
	public void detach(Observer observer);
	
	//to notify all the observers
	public void notifyObservers();
	
	//observer can ask if there are updates
	public Object getUpdates(Observer observer);
}
