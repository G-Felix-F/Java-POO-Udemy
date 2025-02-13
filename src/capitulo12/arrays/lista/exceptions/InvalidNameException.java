package capitulo12.arrays.lista.exceptions;

public class InvalidNameException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String GLOBAL_MESSAGE = "Invalid Name: ";

	public InvalidNameException(String detailMessage) {
		super(GLOBAL_MESSAGE + detailMessage);
	}
}