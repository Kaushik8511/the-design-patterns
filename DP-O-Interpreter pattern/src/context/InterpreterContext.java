package context;

public class InterpreterContext {
	
	public String getBinaryString(int i) {
		return Integer.toBinaryString(i);
	}
	
	public String getHexString(int i) {
		return Integer.toHexString(i);
	}
}
