package colleague;

import mediator.Chat;

public class UserImpl extends User {

	public UserImpl(Chat mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println("Sending message from " + getName() + ": " + message);
		mediator.sendMessage(this, message);
	}

	@Override
	public void receive(User user, String message) {
		System.out.println(user.getName() + " to " + getName() + ": " + message);
	}

}
