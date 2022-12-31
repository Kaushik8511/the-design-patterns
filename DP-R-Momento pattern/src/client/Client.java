package client;

import caretaker.FileWriterCaretaker;
import originator.FileWriterUtil;

public class Client {

	public static void main(String[] args) {
		FileWriterCaretaker caretaker = new FileWriterCaretaker();
		
		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("My first line of code\n");
		
		//save the file
		caretaker.save(fileWriter);
		
		fileWriter.write("statement to be undone\n\n");
		
		System.out.println(fileWriter);
		
		//undo
		caretaker.undo(fileWriter);
		
		System.out.println(fileWriter);
	}

}
