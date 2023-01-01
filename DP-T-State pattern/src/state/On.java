package state;

import context.TV;

public class On implements RemoteControl {

	@Override
	public void process(TV context) {
		System.out.println("I am currenly on. Going to off.");
		context.setState(new Off());
	}

}
