package capitulo8.POO.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_73 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = R$%.2f", Exercicio1_73_CurrencyConverter.converter(dollar, dollarPrice));
	}
}