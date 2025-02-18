package exceptions;

public class InvalidCategoriaProdutoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidCategoriaProdutoException(String message) {
		super(">>> Categoria de Produto Inválido: " + message + " <<<");
	}
}
