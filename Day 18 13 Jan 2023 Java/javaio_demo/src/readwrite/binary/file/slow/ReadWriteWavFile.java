package readwrite.binary.file.slow;

import java.io.*;

public class ReadWriteWavFile {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		
				File f1 = new File("src/readwrite/music/file/notify.wav");
		System.out.println(f1.getAbsolutePath());

		File f2 = new File("notify.wav");
		System.out.println(f2.getAbsolutePath());

		String inputFile = "notify.wav"; // Inside project folder not inside src/folder right
											// click-->Properties-->Location then check path
		String outputFile = "./../notify_copy.wav"; // . stand for current directory & .. stand for parent directory
//		String outputFile = "../notify_copy.wav";  // the above line and this one both will do same operation if your sure on current location directly jump to parent folder.

		try (InputStream inputStream = new FileInputStream(inputFile);
				OutputStream outputStream = new FileOutputStream(outputFile);) {
			int byteRead = -1;

			while ((byteRead = inputStream.read()) != -1) {
				outputStream.write(byteRead);
			}
			System.out.println("File copied check path:" + new File(outputFile).getCanonicalPath()); // Get absolute
																										// path from
																										// relative path
			
			
			long endTime=System.currentTimeMillis();
					System.out.println("Total Time:"+(endTime-startTime)+"miliseconds");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}