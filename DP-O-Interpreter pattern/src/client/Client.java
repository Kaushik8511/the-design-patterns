package client;

import context.InterpreterContext;
import expression.Expression;
import expression.IntToBinaryString;
import expression.IntToHexString;

public class Client {
	
	private InterpreterContext context;
	
	public Client(InterpreterContext context) {
		this.context = context;
	}
	
	public String interpret(String str) {
		Expression expr = null;
		
		if(str.contains("Hexadecimal")) {
			expr = new IntToHexString(Integer.parseInt(str.substring(0, str.indexOf('i') - 1)));
		}
		else if(str.contains("Binary")) {
			expr = new IntToBinaryString(Integer.parseInt(str.substring(0, str.indexOf('i') - 1)));
		}
		else return str;
		return expr.interpret(context);
	}

	public static void main(String[] args) {
		String str1 = "23 in Binary";
		String str2 = "23 in Hexadecimal";
		
		Client client = new Client(new InterpreterContext());
		
		System.out.println(str1 + " = " + client.interpret(str1));
		System.out.println(str2 + " = " + client.interpret(str2));
		
	}

}
