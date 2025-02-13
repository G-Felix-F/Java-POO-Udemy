package capitulo12.arrays.lista.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import capitulo12.arrays.lista.entities.Employee;

public class Lista_Exercicio {

	public static void main(String[] args) {

		System.out.print("How many employees will be registered? ");
		Integer employees = sc.nextInt();

		for (Integer i = 0; i < employees; i++) {
			addNewEmployee(i);
		}

		salaryIncrease();

		System.out.println("------------------");
		System.out.println("List of employees:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		sc.close();
	}

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static List<Employee> employeeList = new ArrayList<>();

	private static void addNewEmployee(Integer i) {
		System.out.println("------------------");
		System.out.println("Employee #" + (i + 1));
		System.out.print("Id: ");
		Long employeeId = sc.nextLong();
		System.out.print("Name: ");
		String employeeName = sc.next();
		System.out.print("Salary: ");
		Double employeeSalary = sc.nextDouble();

		Employee employee = new Employee(employeeId, employeeName, employeeSalary);

		employeeList.add(employee);
	}

	private static void salaryIncrease() {
		System.out.print("Enter the employee id that will have salary increase : ");
		Long employeeId = sc.nextLong();

		Boolean employeeExists = employeeList.stream().anyMatch(emp -> emp.getId().equals(employeeId));

		if (!employeeExists) {
			System.err.println(Employee.NONEXISTENT_ID);
			return;
		}

		System.out.print("Enter the percentage : ");
		Double employeePercentage = sc.nextDouble();

		employeeList.stream().filter(emp -> emp.getId().equals(employeeId)).findFirst().ifPresent(emp -> {
			emp.setSalary(emp.getSalary() + (emp.getSalary() * employeePercentage / 100));
		});
	}
}