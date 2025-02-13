package programacaoFuncional.consumer;

public class Product {

	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name + String.format(" R$%.2f", price);
	}
}