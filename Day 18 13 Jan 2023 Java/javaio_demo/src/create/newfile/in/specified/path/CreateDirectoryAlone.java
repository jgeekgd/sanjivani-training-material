package create.newfile.in.specified.path;

import java.io.File;

public class CreateDirectoryAlone {
	public static void createFile(String fullPath) {
		File file = new File(fullPath);
		if (file.mkdirs())
			System.out.println("Directory structure created successfull");
		else
			System.out.println("Directory structure already exists in specified path");

	}

	public static void main(String[] args) {
		String path = "." + File.separator + "GD" + File.separator + "PersonalFolder";
		createFile(path);
	}
}
