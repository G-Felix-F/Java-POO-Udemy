package capitulo4.estrutura.sequencial;

import java.util.Locale;

public class ExercicioFixacao24 {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double price3 = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f", product1, price1, product2, price2);
		
		System.out.printf("%n%nRecord: %d years old, code %d and gender: " + gender, age, code);
		
		System.out.printf("%n%nMeasue with eight decimal places: %.8f", price3);
		System.out.printf("%nRounded (three decimal places): %.3f", price3);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f", price3);
		
	}
}