package client;

import Invoker.FileInvoker;
import command.OpenFileCommand;
import receiver.FileSystem;
import util.FSFactory;

public class Client {

	public static void main(String[] args) {
		//creating the receiver
		FileSystem fs = FSFactory.getUnderlyingFileSystem();
		
		//creating command with the associated receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		
		//creating invoker 
		FileInvoker fileInvoker = new FileInvoker(openFileCommand);
		
		//perform action
		fileInvoker.execute();
	}

}
