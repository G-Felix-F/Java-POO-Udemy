package exceptions;

public class InvalidStatusProdutoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidStatusProdutoException(String message) {
		super(">>> Status de Produto Inválido: " + message + " <<<");
	}
}
