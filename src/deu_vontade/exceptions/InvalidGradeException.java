package deu_vontade.exceptions;

public class InvalidGradeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String GLOBAL_MESSAGE = "Invalid ID: ";

	public InvalidGradeException(String detailMessage) {
		super(GLOBAL_MESSAGE + detailMessage);
	}
}