package expression;

import context.InterpreterContext;

public class IntToBinaryString implements Expression {
	
	private int i;
	
	public IntToBinaryString(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext context) {
		return context.getBinaryString(i);
	}

}
