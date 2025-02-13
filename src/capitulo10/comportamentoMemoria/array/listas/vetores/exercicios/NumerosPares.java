package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		String numeroPar = "";
		int quantidadePar = 0;

		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			if (numero % 2 == 0) {
				numeroPar += numero + " ";
				quantidadePar++;
			}
			vetor[i] = numero;
		}
		System.out.println("NÚMEROS PARES: \n" + numeroPar);
		System.out.println("\nQUANTIDADE PARES = " + quantidadePar);

		sc.close();
	}
}