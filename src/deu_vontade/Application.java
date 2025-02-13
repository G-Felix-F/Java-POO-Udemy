package deu_vontade;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import deu_vontade.entities.Student;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		do {
			System.out.print("How many students do you want to register? ");
			studentsCount = sc.nextInt();
		} while (studentsCount <= 0);

		for (Integer i = 0; i < studentsCount; i++) {
			addNewStudent();
		}

		System.out.println(studentList);

		sc.close();
	}

	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static Integer studentsCount = 0;
	private static List<Student> studentList = new ArrayList<>();

	private static void addNewStudent() {
		System.out.println("---------------");
		System.out.print("Student ID: ");
		Long studentId = sc.nextLong();
		System.out.print("Student Name: ");
		String studentName = sc.next();
		System.out.print("Student Grade 1: ");
		Double studentGrade1 = sc.nextDouble();
		System.out.print("Student Grade 2: ");
		Double studentGrade2 = sc.nextDouble();
		System.out.print("Student Grade 3: ");
		Double studentGrade3 = sc.nextDouble();

		Student student = new Student(studentId, studentName, studentGrade1, studentGrade2, studentGrade3);
		studentList.add(student);
	}
}
