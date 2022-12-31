package client;

import colleague.User;
import colleague.UserImpl;
import mediator.Chat;
import mediator.ChatImpl;

public class GroupChat {
	public static void main(String[] args) {
		Chat mediator = new ChatImpl();
		
		User user1 = new UserImpl(mediator, "Kaushik");
		User user2 = new UserImpl(mediator, "Jeet");
		User user3 = new UserImpl(mediator, "Chintan");
		User user4 = new UserImpl(mediator, "Kirtan");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Let's become successful together");
	}
}
