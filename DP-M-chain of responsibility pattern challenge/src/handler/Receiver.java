package handler;

import helper.Message;

public interface Receiver {
	boolean processMessage(Message message);
	void setNextChain(Receiver next);
}
