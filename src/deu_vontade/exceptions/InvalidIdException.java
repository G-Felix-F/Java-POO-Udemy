package deu_vontade.exceptions;

public class InvalidIdException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String EXCEPTION_MESSAGE = "Invalid ID: ";

	public InvalidIdException(String detailMessage) {
		super(EXCEPTION_MESSAGE + detailMessage);
	}
}
