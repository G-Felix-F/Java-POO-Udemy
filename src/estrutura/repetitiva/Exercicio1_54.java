package estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio1_54 {

	public static void main(String[] args) {
		
//		Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//		X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro:");
		int x = sc.nextInt();
		
		if (x >= 1 || x <= 1000) {
			for(int i = 0; i < x + 1; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("O valor deve ser entre 1 e 1000!");
		}
		
		sc.close();
	}
}