package receiver;

public class WindowsFS implements FileSystem {

	@Override
	public void openFile() {
		System.out.println("File is opened in the windows");
	}

	@Override
	public void writeToFile() {
		System.out.println("File is being written in the windows");
	}

	@Override
	public void closeFile() {
		System.out.println("File is closed in the windows");
	}

}
