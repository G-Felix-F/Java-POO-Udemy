package deu_vontade.entities;

import deu_vontade.exceptions.InvalidGradeException;
import deu_vontade.exceptions.InvalidIdException;
import deu_vontade.exceptions.InvalidNameException;

public class Student {

	private static final Integer minGrade = 0;
	private static final Double maxGrade = 10.0;
	
	private Long id;
	private String name;
	private Double grade1, grade2, grade3, gpa;
	
	public Student(Long id, String name, Double grade1, Double grade2, Double grade3) {
		setId(id);
		setName(name);
		setGrade1(grade1);
		setGrade2(grade2);
		setGrade3(grade3);
		setGpa();
	}
	
	@Override
	public String toString() {
		return String.format("Student: %s {ID: %d, GPA: %.2f}", getName(), getId(), getGpa());
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		if (id == null) {
			throw new InvalidIdException("ID can't be null.");
		}
		
		if (id <= 0) {
			throw new InvalidIdException("ID must be greater than zero.");
		}
		
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new InvalidNameException("Name can't be null.");
		}
		
		if (name.trim().isEmpty()) {
			throw new InvalidNameException("Name can't be empty.");
		}
		
		this.name = name;
	}
	
	public Double getGrade1() {
		return grade1;
	}
	
	public void setGrade1(Double grade1) {
		gradeValidate(grade1);
		this.grade1 = grade1;
	}
	
	public Double getGrade2() {
		return grade2;
	}
	
	public void setGrade2(Double grade2) {
		gradeValidate(grade2);
		this.grade2 = grade2;
	}
	
	public Double getGrade3() {
		return grade3;
	}
	
	public void setGrade3(Double grade3) {
		gradeValidate(grade3);
		this.grade3 = grade3;
	}
	
	public Double getGpa() {
		return gpa;
	}
	
	private void setGpa() {
		this.gpa = gpaCalculate(getGrade1(), getGrade2(), getGrade3());
	}
	
	private void gradeValidate(Double grade) {
		if (grade == null) {
			throw new InvalidGradeException("Grade: " + grade + " can't be null.");
		}
		
		if (grade < minGrade) {
			throw new InvalidGradeException("Grade: " + grade + " must be greater than zero.");
		}
		
		if (grade > maxGrade) {
			throw new InvalidGradeException("Grade: " + grade + " must be lower than ten.");
		}
	}
	
	private Double gpaCalculate(Double grade1, Double grade2, Double grade3) {
		return gpa = (grade1 + grade2 + grade3) / 3;
	}
}