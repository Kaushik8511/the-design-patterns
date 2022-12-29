
public class Client {

	public static void main(String[] args) {
		IntegerValueInterface integerValueInterface = new ClassAdapter();
		System.out.println(integerValueInterface.getInteger());
	}

}
