package capitulo4.estrutura.sequencial.exercicios;

import java.util.Scanner;

public class Exercicio3_30 {

	public static void main(String[] args) {
		
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		int valorA, valorB, valorC, valorD;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatro valores inteiros:");
		valorA = sc.nextInt();
		valorB = sc.nextInt();
		valorC = sc.nextInt();
		valorD = sc.nextInt();
		valorA = valorA * valorB - valorC * valorD;
		System.out.println("Diferença de A e B pelo C e D: " + valorA);
		sc.close();
	}
}