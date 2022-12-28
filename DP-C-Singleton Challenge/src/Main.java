
public class Main {

	public static void main(String[] args) {
		System.out.println("Trying to make captain...");
		MakeCaptain c1 = MakeCaptain.getCaptain();
		
		System.out.println("Trying to make another captain for our team...");
		MakeCaptain c2 = MakeCaptain.getCaptain();
		
		if(c1 == c2) System.out.println("both the captains are the same");
	}

}
