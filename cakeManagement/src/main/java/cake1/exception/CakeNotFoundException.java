package cake1.exception;

public class CakeNotFoundException extends RuntimeException {

	public CakeNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CakeNotFoundException(String message) {
		super(message);
		
	
	}

}
