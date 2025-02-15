package enums;

public enum ProdutoStatusEnum {

	ATIVO("Ativo"),
	INATIVO("Inativo"),
	EM_PROMOCAO("Em Promoção");
	
	private String statusEnum;
	
	ProdutoStatusEnum(String statusEnum) {
		this.statusEnum = statusEnum;
	}
	
	public String getStatus() {
		return statusEnum;
	}
	
	public static ProdutoStatusEnum fromString(String statusEnum) {
		for (ProdutoStatusEnum status: ProdutoStatusEnum.values()) {
			if (status.getStatus().equalsIgnoreCase(statusEnum)) {
				return status;
			}
		}
		throw new IllegalArgumentException("Categoria não encontrada: " + statusEnum);
	}
}