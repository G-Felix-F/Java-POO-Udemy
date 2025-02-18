package application;

import java.math.BigDecimal;
import java.util.Locale;

import javax.swing.JOptionPane;

import entity.ProdutoEntity;
import enums.ProdutoCategoriaEnum;
import enums.ProdutoStatusEnum;

public class Application {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println(addProduto());
	}
	
	private static String addProduto() {
	    String nome = JOptionPane.showInputDialog(null, "Nome do Produto:");
	    String descricao = JOptionPane.showInputDialog(null, "Descrição do Produto:");
	    
	    BigDecimal preco = null;
	    try {
	        preco = BigDecimal.valueOf(Long.parseLong(JOptionPane.showInputDialog(null, "Preço do Produto:")));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Preço inválido, por favor insira um valor numérico!");
	        return null;
	    }

	    Integer estoque = null;
	    try {
	        estoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Estoque do Produto:"));
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Estoque inválido, por favor insira um número inteiro!");
	        return null;
	    }

	    String categoriaInput = JOptionPane.showInputDialog(null, "Categoria do Produto (Ex: Eletrônicos, Roupas, etc.):");
	    ProdutoCategoriaEnum categoria = null;
	    try {
	        categoria = ProdutoCategoriaEnum.fromString(categoriaInput);
	    } catch (IllegalArgumentException e) {
	        JOptionPane.showMessageDialog(null, "Categoria inválida, por favor insira uma categoria válida!");
	        return null;
	    }

	    String statusInput = JOptionPane.showInputDialog(null, "Status do Produto (Ativo, Inativo, Em Promoção):");
	    ProdutoStatusEnum status = null;
	    try {
	        status = ProdutoStatusEnum.fromString(statusInput);
	    } catch (IllegalArgumentException e) {
	        JOptionPane.showMessageDialog(null, "Status inválido, por favor insira um status válido!");
	        return null;
	    }

	    ProdutoEntity produto = new ProdutoEntity(nome, descricao, preco, estoque, categoria, status);
	    return produto.getInfoProduto();
	}
}
