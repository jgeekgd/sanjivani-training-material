package trywith.resources.jdk7onwards;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * 
 * Java 1.7 introduces a new language feature for its very well-known try-catch
 * block called try-with-resources. Let’s understand how this new feature works
 * and how it would simplify resources management in Java (e.g. automatically
 * close/release resources after used).
 *
 *
 *
 * Notice there are two tasks we have to do explicitly with this code:
 *
 * 1. Nullify (initialize to null) the two objects sourceChanneland destChannel
 * before using them in the try body: FileChannel sourceChannel = null;
 * FileChannel destChannel = null;
 * 
 * 2. Close these resources in the finally clause:
 * 
 * if (sourceChannel != null) { sourceChannel.close(); }
 * 
 * if (destChannel != null) { destChannel.close(); }
 * 
 */
public class OldStyle {
	public void copyFile(File sourceFile, File destFile) throws IOException {

		FileChannel sourceChannel = null;
		FileChannel destChannel = null;

		try {
			sourceChannel = new FileInputStream(sourceFile).getChannel();
			destChannel = new FileOutputStream(destFile).getChannel();
			sourceChannel.transferTo(0, sourceChannel.size(), destChannel);
		} finally {
			if (sourceChannel != null) {
				sourceChannel.close();
			}
			if (destChannel != null) {
				destChannel.close();
			}
		}
	}
}
