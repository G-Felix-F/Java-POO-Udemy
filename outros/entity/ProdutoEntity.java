package entity;

import java.math.BigDecimal;

import enums.ProdutoCategoriaEnum;
import enums.ProdutoStatusEnum;
import exceptions.InvalidDescricaoProdutoException;
import exceptions.InvalidEstoqueProdutoException;
import exceptions.InvalidNomeProdutoException;
import exceptions.InvalidPrecoProdutoException;

public class ProdutoEntity {

	private static Long contadorId = 1L;
	private Long id;
	private String nome, descricao;
	private BigDecimal preco;
	private Long estoque;
	private ProdutoCategoriaEnum categoria;
	private ProdutoStatusEnum status;

	public ProdutoEntity(String nome, String descricao, BigDecimal preco, Integer estoque,
			ProdutoCategoriaEnum categoriaEnum, ProdutoStatusEnum status) {
		this.id = contadorId++;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = Long.valueOf(estoque);
		this.categoria = categoriaEnum;
		this.status = status;
	}

	public String getInfoProduto() {
		return "\n" + "====================//====================" + "\n" +
				"Informações do Produto:\n" +
				"ID: " + getId() + "\n" +
				"Nome: " + getNome() + "\n" +
				"Descrição: " + getDescricao() + "\n" +
				"Preço: R$ " + getPreco() + "\n" +
				"Estoque: " + getEstoque() + " unidades\n" +
				"Categoria: " + getCategoria() + "\n" +
				"Status: " + getStatus();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			throw new InvalidNomeProdutoException("O nome do produto não pode ser nulo!");
		}

		if (nome.isBlank()) {
			throw new InvalidNomeProdutoException("O nome do produto não pode estar vazio!");
		}

		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null) {
			throw new InvalidDescricaoProdutoException("A descrição do produto não pode ser nulo!");
		}

		if (descricao.isBlank()) {
			throw new InvalidDescricaoProdutoException("A descrição do produto não pode ser vazio!");
		}

		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		if (preco == null) {
			throw new InvalidPrecoProdutoException("O preço do produto não pode ser nulo!");
		}

		if (preco.compareTo(BigDecimal.ZERO) <= 0) {
			throw new InvalidPrecoProdutoException("O preço do produto não pode ser igual ou menor que zero!");
		}
	}

	public Long getEstoque() {
		return estoque;
	}

	public void setEstoque(Long estoque) {
		if (estoque == null) {
			throw new InvalidEstoqueProdutoException("O estoque do produto não pode ser nulo!");
		}

		if (estoque <= 0) {
			throw new InvalidEstoqueProdutoException("O estoque do produto não pode ser igual ou menor que zero!");
		}

		this.estoque = estoque;
	}

	public ProdutoCategoriaEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(ProdutoCategoriaEnum categoria) {
		this.categoria = categoria;
	}

	public ProdutoStatusEnum getStatus() {
		return status;
	}

	public void setCategoria(ProdutoStatusEnum status) {
		this.status = status;
	}
}