package capitulo8.POO;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemPOO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double px = (x1 + x2 + x3) / 2;
		System.out.println("Enter the measures of triangle Y:");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double py = (y1 + y2 + y3) / 2;
		
		
		double areaX = Math.sqrt(px * (px - x1) * (px - x2) * (px - x3));
		double areaY = Math.sqrt(py * (py - y1) * (py - y2) * (py - y3));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}