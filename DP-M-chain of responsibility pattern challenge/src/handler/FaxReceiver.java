package handler;

import helper.Message;

public class FaxReceiver implements Receiver {

	private Receiver next;
	
	@Override
	public boolean processMessage(Message message) {
		if(message.getText().toLowerCase().contains("fax")) {
			System.out.println(message.getPriority() + " priority fax error "+ message.getText() + " processed");
			return true;
		}
		
		if(next != null) next.processMessage(message);
		
		return false;
	}

	@Override
	public void setNextChain(Receiver next) {
		this.next = next;
	}

}
