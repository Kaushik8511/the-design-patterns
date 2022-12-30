package real;

public class Image implements subject.Image {

	private String fileName;
	
	public Image(String fileName) {
		this.fileName = fileName;
		loadFromDisk(this.fileName);
	}
	
	@Override
	public void display() {
		System.out.println(this.fileName + " image is being displayed...");
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName + " image");
	}

}
