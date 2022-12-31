package originator;

public class FileWriterUtil {
	private String fileName;
	private StringBuilder content;
	
	
	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		this.content = new StringBuilder();
	}


	@Override
	public String toString() {
		return this.content.toString();
	}
	
	public void write(String str) {
		content.append(str);
	}
	
	//creates the momento
	public Momento save() {
		return new Momento(this.fileName, this.content);
	}
	
	//undo - restores to previous state
	public void undo(Object object) {
		Momento momento = (Momento) object;
		this.fileName = momento.fileName;
		this.content = momento.content;
	}
	
	private class Momento {
		private String fileName;
		private StringBuilder content;
		
		
		public Momento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			this.content = new StringBuilder(content);
		}
	}
}
