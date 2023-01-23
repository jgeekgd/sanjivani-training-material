package _06.java8.lambadas.complex.example;

/*
 * Rules.
 * 1. Only one abstract Method
 * 2. We can add as many default methods as we want
 * 3. We can add as many static methods as we want
 * 4. We can have Object class methods too which will not be counted as abstract methods...
 * 
 *  boolean equals(Object obj);         //Because not considered as functional interface abstract method
 *  public String toString();          //Because not considered as functional interface abstract method

 *	Why they allowed Object class methods to be mentioned as abstract--
 *  Because any implementing class will always have implementation inherited from java.lang.Object or elsewhere
 *  
 */

@FunctionalInterface
public interface Passport {
	static final String ORIGIN_COUNTRY = "INDIA";
	static final String CURRENT_YEAR = "2022";

	boolean isValidPassport(String passportNumber, String passportExpiryDate);

	// if you dont write @FunctionalInterface then below will compile..
	// But interface will not be Functional Interface... be causcious..
	// boolean fakeVisa();

	default String originCountry() {
		return ORIGIN_COUNTRY;
	}

	static String getCurrentYear() {
		return CURRENT_YEAR;
	}

	boolean equals(Object obj);

	public String toString();

	int hashCode();
}
