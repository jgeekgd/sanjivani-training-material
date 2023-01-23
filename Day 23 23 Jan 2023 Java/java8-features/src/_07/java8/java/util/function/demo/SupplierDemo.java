package _07.java8.java.util.function.demo;

import java.util.Random;
import java.util.function.Supplier;

class RandomPassword implements Supplier<String> {

	@Override
	public String get() {
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
		return new String(password).toUpperCase();
	}

}

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> random10CharPassword = new RandomPassword();
		String result = random10CharPassword.get();
		System.out.println("Generated 10 charcater random password is : " + result);

		Supplier<String> random10CharPasswordSmart = () -> {
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
			return new String(password).toUpperCase();
		};

		String resultLambda = random10CharPasswordSmart.get();
		System.out.println("Generated 10 charcater random password is : " + resultLambda);

		// Shorter version
		Supplier<Integer> supplier = () -> ((int) (Math.random() * 10));
		System.out.println("Ramdom  numer from 0 to 10 is:" + supplier.get());

	}
}
