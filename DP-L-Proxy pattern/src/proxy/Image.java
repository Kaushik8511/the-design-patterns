package proxy;

public class Image implements subject.Image {

	private real.Image realImage = null;
	private String fileName;

	public Image(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null)
			realImage = new real.Image(this.fileName);
		realImage.display();
	}

}
