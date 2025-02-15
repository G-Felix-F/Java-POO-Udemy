package exceptions;

public class InvalidDescricaoProdutoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidDescricaoProdutoException(String message) {
		super(">>> Descrição de Produto Inválido: " + message + " <<<");
	}
}
