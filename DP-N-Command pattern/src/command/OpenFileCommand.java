package command;

import receiver.FileSystem;

public class OpenFileCommand implements Command {

	private FileSystem fileSystem;
	
	public OpenFileCommand(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}
	
	@Override
	public void execute() {
		fileSystem.openFile();
	}
	
	//we can define undo and redo operations here

}
