package Application;

import entity.ProdutoEntity;

public class Application {

	public static void main(String[] args) {
		ProdutoEntity produto = new ProdutoEntity();
		produto.setNome("");
		
		produto.getNome();
	}
}
