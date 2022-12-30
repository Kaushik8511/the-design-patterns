package real;

public class Internet implements subject.Internet {

	@Override
	public void connectTo(String url) throws Exception {
		System.out.println(url + " Connected successfully");
	}

}
