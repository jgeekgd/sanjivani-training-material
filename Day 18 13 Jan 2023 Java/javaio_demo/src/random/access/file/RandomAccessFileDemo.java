package random.access.file;

/**
 * 
 * Unlike IO streams that allow reading and writing data sequentially, random
 * access file allows you to read and write a small chunk of data at any
 * position in the file, using a file pointer. By controlling this file pointer,
 * you can move forth and back within the file to perform reading and writing
 * operations, at any position you want, in a random fashion.
 * 
 * Random access file is ideal for manipulating a particular file format at low
 * level, such as reading, creating and updating MP3 files, PDF files, etc and
 * even your own file format.
 *
 *
 * Java RandomAccessFile provides the facility to read and write data to a file.
 * RandomAccessFile works with file as large array of bytes stored in the file
 * system and a cursor using which we can move the file pointer position.
 *
 *
 * RandomAccessFile class is part of Java IO. While creating the instance of RandomAccessFile in java, we need to provide the mode to open the file. For example, to open the file for read only mode we have to use “r” and for read-write operations we have to use “rw”. Using file pointer, we can read or write data from random access file at any position. To get the current file pointer, you can call getFilePointer() method and to set the file pointer index, you can call seek(int i) method. If we write data at any index where data is already present, it will override it.
 *
 */

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// file content is "ABCDEFGH"  //8
			String filePath = "source.txt";
            System.out.println(new String(readCharsFromFile(filePath, 0, 5))); //ABCDE

			writeData(filePath, "Data", 5);  //Over Write each Time
			// now file content is "ABCDEData"

			appendData(filePath, "Gd");
			// now file content is "ABCDEDataGd"
			System.out.println(new String(readCharsFromFile(filePath, 0, (int)new RandomAccessFile(filePath, "r").length())));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void appendData(String filePath, String data) throws IOException {
		RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
		raFile.seek(raFile.length());
		System.out.println("current pointer = " + raFile.getFilePointer());
		raFile.write(data.getBytes());
		raFile.close();

	}

	private static void writeData(String filePath, String data, int seek) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(seek);
		file.write(data.getBytes()); //4 bytes Data
		file.close();
	}

	private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(seek); //0
		byte[] bytes = new byte[chars]; //5
		file.read(bytes);
		file.close();
		return bytes;
	}

}

//https://www.digitalocean.com/community/tutorials/java-randomaccessfile-example