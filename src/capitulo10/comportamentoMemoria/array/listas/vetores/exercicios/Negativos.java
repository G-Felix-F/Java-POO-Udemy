package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		if (n > 10) {
			System.out.println("10 números é o limite máximo, digite novamente: ");
			n = sc.nextInt();
		}
		int[] vetor = new int[n];
		String numeroNegativo = "";

		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			if (numero < 0) {
				numeroNegativo += numero + "\n";
			}
		}
		System.out.println("Números Negativos: \n" + numeroNegativo);
		sc.close();
	}
}