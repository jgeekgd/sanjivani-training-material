package custom.checked.unchecked.exception.demo;

public class ExceptionDemo {
	public static void main(String[] args) {
		ExceptionDemo demo = new ExceptionDemo();

		try {
			// Removing the try/catch will result in a compilation error
			demo.doChecked();
		} catch (CheckedException e) {
			e.printStackTrace();
		}

		// Note: Not inside a try/catch, in spite of the throws clause
		demo.doUnchecked();
	}

	public void doChecked() throws CheckedException {
		System.out.println("doing something that may throw a checked exception");
	}

	// Note: "throws" clause is unnecessary for an unchecked exception
	public void doUnchecked() throws UncheckedException { // throws is optional
		System.out.println("doing something that may throw an unchecked exception");
	}
}
