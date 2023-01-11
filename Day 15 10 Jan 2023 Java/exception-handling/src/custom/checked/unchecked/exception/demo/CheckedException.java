package custom.checked.unchecked.exception.demo;

public class CheckedException extends Exception {
	public CheckedException() {
		super();
	}

	public CheckedException(String message) {
		super(message);
	}

	public CheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CheckedException(Throwable cause) {
		super(cause);
	}
}
