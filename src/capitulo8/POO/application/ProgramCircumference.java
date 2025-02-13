package capitulo8.POO.application;

import java.util.Locale;
import java.util.Scanner;

import capitulo8.POO.util.Calculator;

public class ProgramCircumference {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius:");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.println("PI Value: " + Calculator.PI);
	
		sc.close();
	}
}