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
 */
public class NewStyle {
	public void copyFile(File sourceFile, File destFile) throws IOException {

		try (FileChannel sourceChannel = new FileInputStream(sourceFile).getChannel();
				FileChannel destChannel = new FileOutputStream(destFile).getChannel();) {

			sourceChannel.transferTo(0, sourceChannel.size(), destChannel);

		}
	}
}
