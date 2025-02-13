package deu_vontade.exceptions;

public class InvalidNameException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String EXCEPTION_MESSAGE = "Invalid Name: ";
	
	public InvalidNameException(String detailMessage) {
		super(EXCEPTION_MESSAGE + detailMessage);
	}
}