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
		ProdutoEntity produto1 = new ProdutoEntity(
	            "Camiseta",
	            "Camiseta de algodão branca",
	            new BigDecimal("39.99"),
	            50,
	            ProdutoCategoriaEnum.ROUPAS,
	            ProdutoStatusEnum.ATIVO
	        );

	        ProdutoEntity produto2 = new ProdutoEntity(
	            "Notebook",
	            "Notebook para uso profissional",
	            new BigDecimal("2999.99"),
	            10,
	            ProdutoCategoriaEnum.ELETRONICOS,
	            ProdutoStatusEnum.ATIVO
	        );

	        ProdutoEntity produto3 = new ProdutoEntity(
	            "Mesa de Escritório",
	            "Mesa de madeira para escritório",
	            new BigDecimal("499.99"),
	            20,
	            ProdutoCategoriaEnum.MOVEIS,
	            ProdutoStatusEnum.ATIVO
	        );

	        ProdutoEntity produto4 = new ProdutoEntity(
	            "Fone de Ouvido",
	            "Fone de ouvido Bluetooth",
	            new BigDecimal("199.99"),
	            15,
	            ProdutoCategoriaEnum.ELETRONICOS,
	            ProdutoStatusEnum.INATIVO
	        );

	        JOptionPane.showMessageDialog(null, produto1.getInfoProduto() + 
	        									produto2.getInfoProduto() +
	        									produto3.getInfoProduto() +
	        									produto4.getInfoProduto());

	}
}
