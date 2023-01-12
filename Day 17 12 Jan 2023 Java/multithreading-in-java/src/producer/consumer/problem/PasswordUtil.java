package producer.consumer.problem;

import java.util.Random;

public class PasswordUtil {
	public static String randomPassword() {
		int length = 10;
		String symbol = "-/.^&*_!@%=+>)";
		String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_letter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";

		String finalString = cap_letter + small_letter + numbers + symbol;

		Random random = new Random();

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			password[i] = finalString.charAt(random.nextInt(finalString.length()));

		}
		return new String(password);
	}
}
//https://stackoverflow.com/questions/31260512/generate-a-secure-random-password-in-java-with-minimum-special-character-require
//https://www.baeldung.com/java-generate-secure-password
