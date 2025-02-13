package programacaoFuncional.predicate;

public class Product {

	String name;
	public double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p) { //Trabalha com o Product no parâmetro
		return p.price >= 100;
	}
	
	public boolean nonProductPredicate() { //Trabalha com a Instância do Objeto
		return price >= 100;
	}
	
	public String toString() {
		return name + String.format(" R$%.2f", price);
	}
}