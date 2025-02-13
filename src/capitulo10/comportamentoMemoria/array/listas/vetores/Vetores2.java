package capitulo10.comportamentoMemoria.array.listas.vetores;

import java.util.Locale;
import java.util.Scanner;

import capitulo10.comportamentoMemoria.array.listas.vetores.entities.Product;

public class Vetores2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Product name: ");
			String name = sc.nextLine();
			System.out.println("Product price ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE: %.2f", avg);
		
		sc.close();
	}
}