package capitulo4.estrutura.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_30 {

	public static void main(String[] args) {
		
//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		
		Locale.setDefault(Locale.US);
		
		int codigo1, codigo2, numeroPecas1, numeroPecas2;
		double valor1, valor2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código da Peça 1: ");
		codigo1 = sc.nextInt();
		System.out.print("Número de Peças 1: ");
		numeroPecas1 = sc.nextInt();
		System.out.print("Valor Unitário da Peça 1: ");
		valor1 = sc.nextDouble();
		
		
		System.out.print("Código da Peça 2: ");
		codigo2 = sc.nextInt();
		System.out.print("Número de Peças 2: ");
		numeroPecas2 = sc.nextInt();
		System.out.print("Valor Unitário da Peça 2: ");
		valor2 = sc.nextDouble();
		
		valor1 = numeroPecas1 * valor1 + numeroPecas2 * valor2;
		
		System.out.printf("Valor a ser Pago: U$%.2f", valor1);
		sc.close();
	}
}
