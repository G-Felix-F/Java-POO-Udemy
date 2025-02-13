package programacaoFuncional.interfaces;

import java.util.function.Predicate;

import programacaoFuncional.predicate.Product;

public class ProductPredicate implements Predicate<Product> {
	
	@Override
	public boolean test(Product p) {
		return p.price >= 100;
	}
}