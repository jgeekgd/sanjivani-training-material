package exceptionhandling;

/**
 * 
 * The Java throws keyword is used to declare an exception. It gives an
 * information to the programmer that there may occur an exception. So, it is
 * better for the programmer to provide the exception handling code so that the
 * normal flow of the program can be maintained.
 * 
 * 
 *
 */
public class ThrowsDemo {
	void someMethod() throws Exception { // since the exception here thrown is of Checked Type the caller of this method
											// must wrote try...catch block
		for (int i = 0; i < 10; i++)
			if (i == 4)
				throw new Exception();
		// throw new Exception("I reached 4!");
	}

	public static void main(String args[]) {
		try {
			new ThrowsDemo().someMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * In case you do not want to handle the Checked Exception and want System/JVM to handle it.
	 * public static void main(String args[]) throws Exception{ 
	 *  new ThrowsDemo().someMethod();
	 * }
	 */
}
