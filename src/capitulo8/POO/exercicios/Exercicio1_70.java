package capitulo8.POO.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_70 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Exercicio1_70_Rectangle rectangle = new Exercicio1_70_Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());

		sc.close();
	}
}