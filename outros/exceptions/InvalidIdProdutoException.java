package exceptions;

public class InvalidIdProdutoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidIdProdutoException(String message) {
		super(">>> ID de Produto Inválido: " + message + " <<<");
	}
}
