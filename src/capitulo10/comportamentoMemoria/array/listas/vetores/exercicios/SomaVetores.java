package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vetor1 = new int[n];
		int[] vetor2 = new int[n];

		System.out.println("Digite o valores do vetor A:");

		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			vetor1[i] = numero;
		}

		System.out.println("Digite o valores do vetor B:");

		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			vetor2[i] = numero;
		}

		System.out.println("\nVETOR RESULTANTE: ");

		for (int i = 0; i < vetor1.length; i++) {
			System.out.println(vetor1[i] += vetor2[i]);
		}
		sc.close();
	}
}