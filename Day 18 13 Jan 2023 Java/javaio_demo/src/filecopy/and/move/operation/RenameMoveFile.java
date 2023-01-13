package filecopy.and.move.operation;

import java.io.File;

public class RenameMoveFile {
	public static void main(String[] args) {
		File sourceFile = new File("TrainAnnouncement.wav");
		File destFile = new File("GD/PersonalFolder/TrainAnnouncement.wav");

		if (sourceFile.renameTo(destFile)) {
			System.out.println("File moved successfully");
		} else {
			System.out.println("Failed to move file, Check if already moved, else check if \"GD/PersonalFolder/\" this directory exists");
		}
	}
}
