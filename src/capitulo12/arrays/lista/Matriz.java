package capitulo12.arrays.lista;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		Integer[][] matriz = new Integer[n][n];
		Integer negative = 0;
		
		for (Integer i = 0; i < matriz.length; i++) {
			for (Integer j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] < 0) {
					negative++;
				}
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (Integer i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println("Negative Numbers: " + negative);
		
		sc.close();
	}
}