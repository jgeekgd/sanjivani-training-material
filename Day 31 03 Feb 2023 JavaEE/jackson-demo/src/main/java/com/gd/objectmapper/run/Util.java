package com.gd.objectmapper.run;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class Util {
	public static File getFileFromResource(String fileName) {

		ClassLoader classLoader = new Util().getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {

			// failed if files have whitespaces or special characters
			// return new File(resource.getFile());

			try {
				return new File(resource.toURI());
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
