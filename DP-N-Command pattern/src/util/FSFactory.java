package util;

import receiver.FileSystem;
import receiver.UnixFS;
import receiver.WindowsFS;

public class FSFactory {
	
	public static FileSystem getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying os is: " + osName);
		if(osName.contains("Windows")) {
			return new WindowsFS();
		}
		return new UnixFS();
	}
}
