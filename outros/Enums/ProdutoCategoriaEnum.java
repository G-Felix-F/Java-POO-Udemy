package enums;

public enum ProdutoCategoriaEnum {

	ELETRONICOS("Eletrônicos"),
	ROUPAS("Roupas"),
	ALIMENTOS("Alimentos"),
	BELEZA("Beleza"),
	MOVEIS("Móveis");
	
	private String categoriaEnum;
	
	ProdutoCategoriaEnum(String nomeCategoria) {
		this.categoriaEnum = nomeCategoria;
	}
	
	public String getNome() {
		return categoriaEnum;
	}
	
	public static ProdutoCategoriaEnum fromString(String categoriaEnum) {
		for (ProdutoCategoriaEnum categoria: ProdutoCategoriaEnum.values()) {
			if (categoria.getNome().equalsIgnoreCase(categoriaEnum)) {
				return categoria;
			}
		}
		throw new IllegalArgumentException("Categoria não encontrada: " + categoriaEnum);
	}
}