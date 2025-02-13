package capitulo12.arrays.lista.entities;

import capitulo12.arrays.lista.exceptions.InvalidIdException;
import capitulo12.arrays.lista.exceptions.InvalidNameException;
import capitulo12.arrays.lista.exceptions.InvalidSalaryException;

public class Employee {

	public static final String NONEXISTENT_ID = "This ID does not exist!";

	private Long id;
	private String name;
	private Double salary;

	public Employee(Long id, String name, Double salary) {
		setId(id);
		setName(name);
		setSalary(salary);
	}

	@Override
	public String toString() {
		return getId() + ", " + getName() + ", " + getSalary();
	}

	public Long getId() {
		return this.id;
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
		return this.name;
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

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		if (salary == null) {
			throw new InvalidIdException("Salary can't be null.");
		}

		if (salary < 0) {
			throw new InvalidSalaryException("Salary must be greater than zero.");
		}

		this.salary = salary;
	}

}