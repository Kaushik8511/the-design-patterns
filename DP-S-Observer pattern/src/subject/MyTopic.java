package subject;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class MyTopic implements Subject {
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	public MyTopic() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer observer) {
		if(observer == null) throw new NullPointerException("Null observer");
		if(!observers.contains(observer)) observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		
		if(!changed) return;
		
		observersLocal = new ArrayList<Observer>(this.observers);
		this.changed = false;
		for(Observer observer: observersLocal) {
			observer.update();
		}
	}

	@Override
	public Object getUpdates(Observer observer) {
		return this.message;
	}
	
	//method to post message to the topic, change state (trigger notification)
	public void postMessage(String msg) {
		System.out.println("Message posted to the topic " + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
