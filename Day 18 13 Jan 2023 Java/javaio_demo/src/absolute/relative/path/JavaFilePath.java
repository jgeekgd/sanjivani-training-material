package absolute.relative.path;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 
 * https://www.digitalocean.com/community/tutorials/java-file-path-absolute-canonical
 * https://www.javatpoint.com/bash-relative-vs-absolute-path
 * 
 * A path can be absolute or relative. An absolute path contains the full path
 * from the root of the file system down to the file or directory it points to.
 * 
 * A relative path contains the path to the file or directory relative to some
 * other path.
 * 
 *
 */
public class JavaFilePath {

	public static void main(String[] args) throws IOException, URISyntaxException {
		System.out.println("---------- Absolute path ----------");
		File file = new File("C:\\Program Files\\Eclipse Adoptium\\jdk-8.0.352.8-hotspot\\bin\\javac.exe");
		printPaths(file);
		System.out.println("---------- Relative path----------");
		file = new File("../../../../");
		printPaths(file);
		System.out.println("---------- URI path----------");
		// the "file:" URI is another way of specifying a pathname to the File class.
		file = new File(new URI("file:///C:/Program%20Files/Eclipse%20Adoptium/jdk-8.0.352.8-hotspot/bin/javac.exe"));
		// Errorif you use below path
		// file = new File(new
		// URI("https://github.com/jgeekgd/sanjivani-training-material/blob/main/README.md"));
		printPaths(file);
	}

	private static void printPaths(File file) throws IOException {
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Canonical Path: " + file.getCanonicalPath());
		System.out.println("Path: " + file.getPath());
	}

}