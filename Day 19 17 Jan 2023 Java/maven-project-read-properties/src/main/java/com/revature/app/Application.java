package com.revature.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

//https://maven.apache.org/download.cgi
//https://maven.apache.org/install.html
//https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
//https://maven.apache.org/guides/mini/guide-site.html
//https://maven.apache.org/guides/getting-started/index.html#How_do_I_filter_resource_files


/**
 * The Java Platform provides two subclasses of ResourceBundle,
 * ListResourceBundle and PropertyResourceBundle, that provide a fairly simple
 * way to create resources.
 * 
 * PropertyResourceBundle uses a properties file to manage its resources.
 * 
 * @author GangadharParde
 *
 */

public class Application {

	public static void main(String[] args) {

		usingResourceBundle();
		//usingPropertiesClassStatic();
		// new Application().usingPropertiesClassNonStatic();
		// https://mkyong.com/java/java-getresourceasstream-in-static-method/

	}
	private static void usingResourceBundle() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("gd");
		String dburl = resourceBundle.getString("dburl");
		String driver = resourceBundle.getString("driver");
		String username = resourceBundle.getString("username");
		String password = resourceBundle.getString("password");
		System.out.println("dburl:" + dburl);
		System.out.println("driver:" + driver);
		System.out.println("username:" + username);
		System.out.println("password:" + password);
	}
	
	private static void usingPropertiesClassStatic() {
		Properties prop = new Properties();
		try (InputStream inputStream = Application.class.getClassLoader().getResourceAsStream("gd.properties");) {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("dburl:" + prop.getProperty("dburl"));
		System.out.println("driver:" + prop.getProperty("driver"));
		System.out.println("username:" + prop.getProperty("username"));
		System.out.println("password:" + prop.getProperty("password"));
	}

	private void usingPropertiesClassNonStatic() {
		Properties prop = new Properties();
		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("gd.properties");) {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("dburl:" + prop.getProperty("dburl"));
		System.out.println("driver:" + prop.getProperty("driver"));
		System.out.println("username:" + prop.getProperty("username"));
		System.out.println("password:" + prop.getProperty("password"));
	}

	
}

//https://mkyong.com/java/java-getresourceasstream-in-static-method/
