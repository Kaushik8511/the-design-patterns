package client;

public class Client {

	public static void main(String[] args) {
		subject.Image image = new proxy.Image("DJND00001.jpg");
		
		//image will be loaded from disk
		image.display();
		
		System.out.println("");
		
		//in second call image will not be creates again.
		image.display();
		
	}

}
