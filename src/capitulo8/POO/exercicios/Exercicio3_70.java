package capitulo8.POO.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_70 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Exercicio3_70_Student student = new Exercicio3_70_Student();
		
		System.out.println("Grade Verificator");
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		student.finalGrade();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60) {
			System.out.printf("FAILED%nMISSING %.2f POINTS", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}