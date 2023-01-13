package file.directory.path.seperator;

import java.io.File;

public class PlatformIndepdentSeperator {

	public static void main(String[] args) {
		seperatorUse();
		pathSeperatorUse();

	}

	// To make our program platform independent, we should always use separators to
	// create file paths
	private static void seperatorUse() {
		// no platform independence, good for Unix systems
		File fileUnsafe = new File("tmp/abc.txt");
		// platform independent and safe to use across Unix and Windows
		File fileSafe = new File("tmp" + File.separator + "abc.txt");
	}

	// To make our program platform independent, we should always use path
	// separators read any system variables like PATH, CLASSPATH.
	private static void pathSeperatorUse() {
		String listOfFiles = "/path/to/jar1.jar:/path/to/jar2.jar:/path/to/jar3.jar";
		String[] filePaths = listOfFiles.split(File.pathSeparator);
	}
}
