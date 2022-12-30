package command;

import receiver.FileSystem;

public class WriteToFileCommand implements Command {

	private FileSystem fileSystem;
	
	public WriteToFileCommand(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}
	
	@Override
	public void execute() {
		fileSystem.writeToFile();
	}

}
