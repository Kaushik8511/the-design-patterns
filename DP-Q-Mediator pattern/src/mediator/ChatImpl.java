
package mediator;

import java.util.ArrayList;
import java.util.List;

import colleague.User;

public class ChatImpl implements Chat {
	
	private List<User> users;
	
	public ChatImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendMessage(User user, String message) {
		for(User currUser: users) {
			//message should not be received by the sender
			if(currUser != user) currUser.receive(user, message);
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
