package capitulo8.POO.exercicios;

import java.util.Scanner;

public class Exercicio2_70 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Exercicio2_70_Employee employee = new Exercicio2_70_Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Uptaded data: " + employee);
		
		sc.close();
	}
}