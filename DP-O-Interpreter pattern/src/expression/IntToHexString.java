package expression;

import context.InterpreterContext;

public class IntToHexString implements Expression {
	
	private int i;
	
	public IntToHexString(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext context) {
		return context.getHexString(i);
	}

}
