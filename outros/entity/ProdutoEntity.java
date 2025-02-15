package entity;

import java.math.BigDecimal;

import Enums.ProdutoCategoriaEnum;
import Enums.ProdutoStatusEnum;
import exceptions.InvalidDescricaoProdutoException;
import exceptions.InvalidNomeProdutoException;
import exceptions.InvalidPrecoProdutoException;

public class ProdutoEntity {

	private static Long contadorId = 0L;
	private Long id;
	private String nome, descricao;
	private BigDecimal preco;
	private Long estoque;
	private ProdutoCategoriaEnum categoria;
	private ProdutoStatusEnum status;
	
	public ProdutoEntity(String nome, String descricao, BigDecimal preco, Integer estoque, ProdutoCategoriaEnum categoriaEnum, ProdutoStatusEnum status) {
		this.id = contadorId++;
	}
	
	public ProdutoEntity() {};
	
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
	
}