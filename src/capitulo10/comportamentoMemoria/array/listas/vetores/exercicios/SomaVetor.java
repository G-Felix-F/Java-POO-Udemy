package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];
		String vetorString = "";
		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			double numero = sc.nextDouble();
			vetor[i] = numero;
			vetorString += numero + " ";
			soma += numero;
		}

		System.out.println("VALORES: " + vetorString);
		System.out.printf("SOMA: %.2f %n", soma);
		System.out.printf("MÉDIA: %.2f %n", (soma / vetor.length));

		sc.close();
	}
}