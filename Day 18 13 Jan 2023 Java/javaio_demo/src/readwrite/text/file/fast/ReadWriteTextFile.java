package readwrite.text.file.fast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This program demonstrates how to read characters from a text file.
 */
public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();

		try {
			FileReader reader = new FileReader("Quotes.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileWriter writer = new FileWriter("Quotes_Copy.txt", false); // append true of false
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write("The way to get started is to quit talking and begin doing.");
			bufferedWriter.newLine();  // as per your operating system supported new line character
			writer.write("- Anonymous");

			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File copied check path:" + new File("Quotes_Copy_Fast.txt").getCanonicalPath());
		// Get absolute path from relative path
		// Check how the above message is shown this is due to exact chracter by
		// character reading of previous file the last position of cursor was on the
		// same line as the last character of read file.

		long endTime = System.currentTimeMillis();
		System.out.println("Total Time:" + (endTime - startTime) + "miliseconds");

	}

}

/**
 * \n means new line. It means that the cursor must go to the next line.
 * 
 * \r means carriage return. It means that the cursor should go back to the
 * beginning of the line.
 * 
 * Unix programs usually only needs a new line (\n).
 * 
 * Windows programs usually need both.
 * 
 * -----------------------------------------------------
 * 
 * \r\n is a Windows Style
 * 
 * \n is a POSIX Style
 * 
 * \r is a old pre-OS X Macs Style, Modern Mac's using POSIX Style.
 *
 *
 *
 * \r is a carriage return and \n is a line feed, in old computers where it not
 * have monitor, have only printer to get out programs result to user, if you
 * want get printing from staring of new line from left, you must get \n for
 * Line Feed, and \r for get Carriage return to the most left position, this is
 * from old computers syntax saved to this time on Windows platform.
 * 
 */