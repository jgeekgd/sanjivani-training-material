package custom.checked.unchecked.exception.demo;

public class UncheckedException extends RuntimeException {
	public UncheckedException() {
		super();
	}

	public UncheckedException(String message) {
		super(message);
	}

	public UncheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UncheckedException(Throwable cause) {
		super(cause);
	}
}
