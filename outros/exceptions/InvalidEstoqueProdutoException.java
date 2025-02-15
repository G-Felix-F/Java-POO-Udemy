package exceptions;

public class InvalidEstoqueProdutoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidEstoqueProdutoException(String message) {
		super(">>> Estoque de Produto Inválido: " + message + " <<<");
	}
}