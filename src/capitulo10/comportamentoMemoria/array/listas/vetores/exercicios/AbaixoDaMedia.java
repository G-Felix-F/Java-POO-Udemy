package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];
		double media = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			double numero = sc.nextDouble();
			vetor[i] = numero;
			media += numero;
		}

		media = media / vetor.length;
		String abaixoMedia = "";

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				abaixoMedia += vetor[i] + "\n";
			}
		}
		System.out.printf("%nMÉDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: \n" + abaixoMedia);

		sc.close();
	}
}