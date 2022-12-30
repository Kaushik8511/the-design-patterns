package client;

import handler.Receiver;
import helper.Message;

public class IssueRaiser {
	public Receiver receiver;
	
	public IssueRaiser(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void raiseMessage(Message message) {
		if(receiver != null) receiver.processMessage(message);
	}
}
