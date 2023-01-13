package create.newfile.in.specified.path;

import java.io.File;
import java.io.IOException;

public class CreateNewFileInSpecifiedPath {
	public static void createFile(String fullPath) {
		try {
			File file = new File(fullPath);
			file.getParentFile().mkdirs(); //Error if skipped folder must exist first: java.io.IOException: The system cannot find the path specified
			if (file.createNewFile())
				System.out.println("File creation including directory structure is successfull");
			else
				System.out.println("File already exists in specified path");
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String path = "." + File.separator + "GD" + File.separator + "GuestFolder" + File.separator + "hi.txt";
		createFile(path);
	}
}
