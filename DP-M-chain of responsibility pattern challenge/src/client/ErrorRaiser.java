package client;


import handler.EmailReceiver;
import handler.FaxReceiver;
import handler.Receiver;
import helper.Message;
import helper.MessagePriority;

public class ErrorRaiser {

	public static void main(String[] args) {
		
		//making the chain
		//first fax and then email
		Receiver faxHandler, emailHandler;
		
		emailHandler = new EmailReceiver();
		
		faxHandler = new FaxReceiver();
		faxHandler.setNextChain(emailHandler);
		
		IssueRaiser raiser = new IssueRaiser(faxHandler);
		
		Message m1 = new Message("high priority error from the emaiL", MessagePriority.High);
		Message m2 = new Message("normal priority error from the FAX", MessagePriority.Normal);
		Message m3 = new Message("high priority error from the fax", MessagePriority.High);
		Message m4 = new Message("normal priority error from the eMaiL", MessagePriority.Normal);
		
		raiser.raiseMessage(m1);
		raiser.raiseMessage(m2);
		raiser.raiseMessage(m3);
		raiser.raiseMessage(m4);
	}

}
