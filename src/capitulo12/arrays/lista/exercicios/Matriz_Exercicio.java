package capitulo12.arrays.lista.exercicios;

import java.util.Scanner;

public class Matriz_Exercicio {

	public static void main(String[] args) {

		Integer[][] matrix = createMatrix(sc);
		insertValueMatrix(matrix, sc);

		int number;
		do {
			System.out.print("Number (0 to exit): ");
			number = sc.nextInt();
			if (number != 0) {
				findNumberInMatrix(matrix, number);
			}
		} while (number != 0);

		sc.close();
	}

	private static Scanner sc = new Scanner(System.in);

	private static Integer[][] createMatrix(Scanner sc) {
		System.out.print("Lines: ");
		int m = sc.nextInt();
		System.out.print("Columns: ");
		int n = sc.nextInt();

		return new Integer[m][n];
	}

	private static void insertValueMatrix(Integer[][] matrix, Scanner sc) {
		System.out.println("Enter the values of the matrix: ");
		for (Integer i = 0; i < matrix.length; i++) {
			for (Integer j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	private static void findNumberInMatrix(Integer[][] matrix, Integer number) {
		for (Integer i = 0; i < matrix.length; i++) {
			for (Integer j = 0; j < matrix[i].length; j++) {
				if (number.equals(matrix[i][j])) {
					System.out.println("Position: (" + i + ", " + j + ")");
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}

					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}

					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
			}
		}
	}
}
