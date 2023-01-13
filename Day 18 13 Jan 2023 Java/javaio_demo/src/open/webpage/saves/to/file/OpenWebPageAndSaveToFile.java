package open.webpage.saves.to.file;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OpenWebPageAndSaveToFile {
	public static void main(String[] args) {
		Path targetFile = Paths.get("Github.html");

		URI uri = URI.create("https://Github.com");

		try (InputStream inputStream = uri.toURL().openStream()) {
			Files.copy(inputStream, targetFile);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Created file Github.html ");
	}
}
