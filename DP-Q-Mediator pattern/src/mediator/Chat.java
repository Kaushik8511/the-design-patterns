package mediator;

import colleague.User;

public interface Chat {
	public void sendMessage(User user, String message);
	public void addUser(User user);
}
