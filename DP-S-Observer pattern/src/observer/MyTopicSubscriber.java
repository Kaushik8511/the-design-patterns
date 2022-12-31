package observer;

import subject.Subject;

public class MyTopicSubscriber implements Observer {
	
	//not required but for pull relation
	private Subject subject;
	
	private String name;
	
	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String message = (String) subject.getUpdates(this);
		if(message == null) {
			System.out.println(name + " no new message");
		}
		else {
			System.out.println(name + ":: consuming message " + message);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
