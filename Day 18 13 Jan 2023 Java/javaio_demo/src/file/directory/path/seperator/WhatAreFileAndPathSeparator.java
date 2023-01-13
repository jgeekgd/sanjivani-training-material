package file.directory.path.seperator;

import java.io.File;

/**
 * You use separator when you are building a file path.
 * 
 * So in unix the separator is /. So if you wanted to build the unix path
 * /var/temp you would do it like this:
 * 
 * String path = File.separator + "var"+ File.separator + "temp"
 * 
 * 
 * You use the pathSeparator when you are dealing with a list of files like in a
 * classpath.
 * 
 * For example, if your app took a list of jars as argument the standard way to
 * format that list on unix is:
 * /path/to/jar1.jar:/path/to/jar2.jar:/path/to/jar3.jar
 * 
 * So given a list of files you would do something like this:
 * 
 * String listOfFiles = ...
 * 
 * String[] filePaths = listOfFiles.split(File.pathSeparator);
 * 
 */
public class WhatAreFileAndPathSeparator {
	public static void main(String[] args) {
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
	}

}

/**
 * Output of above program on Unix system:
 * 
 * File.separator = / File.separatorChar = / File.pathSeparator = :
 * File.pathSeparatorChar = :
 * 
 * Output of the program on Windows system: File.separator = \
 * File.separatorChar = \ File.pathSeparator = ; File.pathSeparatorChar = ;
 * 
 * 
 */