package colleague;

import mediator.Chat;

public abstract class User {
	protected Chat mediator;
	protected String name;
	
	
	public User(Chat mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(User user, String message);

	public Chat getMediator() {
		return mediator;
	}

	public String getName() {
		return name;
	}
	
	
	
}
