package programacaoFuncional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import programacaoFuncional.interfaces.ProductPredicate;

public class Predicate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		//Transforma a formatação em estilo Norte Americano, como casas decimais em "." em vez de ","
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		// IMPLEMENTAÇÃO DA INTERFACE
		list.removeIf(new ProductPredicate());
		
		
		//METHOD REFERENCE ESTÁTICO //Trabalha com o Product no parâmetro
		list.removeIf(Product::staticProductPredicate); 
		 
		
		//METHOD REFERENCE NÃO ESTÁTICO //Trabalha com a Instância do Objeto
		list.removeIf(Product::nonProductPredicate); 
		
		
		//EXPRESSÃO LAMBDA DECLARADA
		java.util.function.Predicate<Product> predicate = p -> p.price >= 100;
		list.removeIf(predicate);
		
		
		//EXPRESSÃO LAMBDA INLINE
		list.removeIf(p -> p.price >= 100);  //removeIf é uma função do tipo Predicate, ele retorna boolean

		System.out.println(list);
	}
}