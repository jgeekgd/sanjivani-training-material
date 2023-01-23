package _06.java8.lambadas.complex.example;

import java.util.Date;

public class Employee implements Passport {
	@Override
	public boolean isValidPassport(String passportNumber, String passportExpiryDate) {
		System.out.println("Passport Number recevied for validation:" + passportNumber);

		if (originCountry().equals("INDIA")) {
			String extractedYear = passportExpiryDate.substring(3, passportExpiryDate.length());
			int year = Integer.parseInt(extractedYear);
			System.out.println("Country is:" + originCountry());
			System.out.println("Passport Date is:" + passportExpiryDate);

			int currentYearInInt = Integer.parseInt(Passport.getCurrentYear());
			if (year > currentYearInInt) {
				System.out.println("Passport Is Valid");
				return true;
			}
			System.out.println("Passport Is InValid");
			return false;
		} else {
			System.out.println("Country is:" + originCountry());
			System.out.println("Passport Date is:" + passportExpiryDate);
			System.out.println("Passport Is InValid");
			return false;
		}
	}
	 
}
