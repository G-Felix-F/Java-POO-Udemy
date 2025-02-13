package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		
		double par = 0;
		int quantidadePar = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			if(numero % 2 == 0) {
				par += numero;
				quantidadePar++;
			}
			vetor[i] = numero;
		}
		
		par = par / quantidadePar;
		
		if(par > 0) {
			System.out.printf("MÉDIA DOS PARES = %.1f", par);
		}
		
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}
}