package exceptions;

public class InvalidPrecoProdutoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidPrecoProdutoException(String message) {
		super(">>> Preço de Produto Inválido: " + message + " <<<");
	}
}