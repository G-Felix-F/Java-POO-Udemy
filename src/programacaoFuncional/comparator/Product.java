package programacaoFuncional.comparator;

public class Product {

	 String nome;
	 double preco;

	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String toString() {
		return nome + " R$" + preco;
	}
}