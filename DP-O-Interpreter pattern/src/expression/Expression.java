package expression;

import context.InterpreterContext;

public interface Expression {
	String interpret(InterpreterContext context);
}
