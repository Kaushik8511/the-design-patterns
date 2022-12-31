package caretaker;

import originator.FileWriterUtil;

public class FileWriterCaretaker {
	private Object object;
	
	public void save(FileWriterUtil fileWriterUtil) {
		this.object = fileWriterUtil.save();
	}
	
	public void undo(FileWriterUtil fileWriterUtil) {
		fileWriterUtil.undo(object);
	}
}
