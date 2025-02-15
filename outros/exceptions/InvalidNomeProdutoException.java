package exceptions;

public class InvalidNomeProdutoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidNomeProdutoException(String message) {
		super(">>> Nome de Produto Inválido: " + message + " <<<");
	}
}