package adapter;

import adaptee.Turkey;
import target.Duck;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// some processing before delegating the call
		turkey.gobble();
		// some processing on result before returning it to the client
	}

	@Override
	public void fly() {
		// some processing before delegating the call
		for (int i = 0; i < 5; i++)
			turkey.fly();
		// some processing on result before returning it to the client
	}

}
