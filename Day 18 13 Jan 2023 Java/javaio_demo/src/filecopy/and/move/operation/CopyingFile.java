package filecopy.and.move.operation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyingFile {
	public static void main(String[] args) {
		// from jdk 1.7 we have Path class available
		Path sourceFile = Paths.get("C:\\Windows\\Media\\notify.wav");
		Path targetFile = Paths.get("TrainAnnouncement.wav"); // caution dont change extension to .mp4 !

		try {
			Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Copied File Successfully to:" + targetFile.toAbsolutePath());
	}
}
