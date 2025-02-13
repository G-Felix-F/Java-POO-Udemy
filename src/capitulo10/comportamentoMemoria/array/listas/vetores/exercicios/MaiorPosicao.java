package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			vetor[i] = numero;
		}

		double numeroMaior = vetor[0];
		int vetorMaior = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (numeroMaior < vetor[i]) {
				numeroMaior = vetor[i];
				vetorMaior = i;
			}
		}
		System.out.println("\nMAIOR VALOR = " + numeroMaior);
		System.out.println("POSICAO DO MAIOR VALOR = " + vetorMaior);

		sc.close();
	}
}