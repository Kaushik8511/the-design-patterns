package receiver;

public class UnixFS implements FileSystem {

	@Override
	public void openFile() {
		System.out.println("File is opened in the unix");
	}

	@Override
	public void writeToFile() {
		System.out.println("File is being written in the unix");
	}

	@Override
	public void closeFile() {
		System.out.println("File is closed in the unix");
	}

}
