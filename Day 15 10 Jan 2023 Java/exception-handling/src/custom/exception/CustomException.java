package custom.exception;

//class representing custom exception  
// As far as possible we try to use JDK inbuild exception classes maximum time instead of creating new ones.


class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 2068398161728713608L;

	public InvalidAgeException(String str) {
		super(str);
	}
}

//class that uses custom exception InvalidAgeException  

public class CustomException {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			// throw an object of user defined exception
			throw new InvalidAgeException("Age is not valid to vote");
		} else {
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String args[]) {
		try {
			validate(13);
		} catch (InvalidAgeException ex) {
			System.out.println("Exception Caught: " + ex);
			//ex.printStackTrace();
		}
	}
}
