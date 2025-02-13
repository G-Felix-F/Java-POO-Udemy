package capitulo12.arrays.lista.exceptions;

public class InvalidIdException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String GLOBAL_MESSAGE = "Invalid ID: ";

	public InvalidIdException(String detailMessage) {
		super(GLOBAL_MESSAGE + detailMessage);
	}
}