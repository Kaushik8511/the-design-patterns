package context;

import state.RemoteControl;

public class TV {
	private RemoteControl state;

	public TV(RemoteControl state) {
		this.state = state;
	}

	public RemoteControl getState() {
		return state;
	}

	public void setState(RemoteControl state) {
		this.state = state;
	}
	
	public void powerButton() {
		state.process(this);
	}
}
