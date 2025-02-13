package capitulo12.arrays.lista.exceptions;

public class InvalidSalaryException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String GLOBAL_MESSAGE = "Invalid Salary: ";

	public InvalidSalaryException(String detailMessage) {
		super(GLOBAL_MESSAGE + detailMessage);
	}
}