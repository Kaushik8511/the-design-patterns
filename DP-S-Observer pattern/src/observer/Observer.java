package observer;

import subject.Subject;

public interface Observer {
	//update the observer
	public void update();
	
	//to set the subject
	//so we can have a pull relation => can ask for updates to subject
	public void setSubject(Subject subject);
	
}
