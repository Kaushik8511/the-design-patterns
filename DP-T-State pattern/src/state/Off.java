package state;

import context.TV;

public class Off implements RemoteControl {

	@Override
	public void process(TV context) {
		System.out.println("I am currenly off. Going to on.");
		context.setState(new On());
	}

}
