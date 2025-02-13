package estrutura.sequencial.exercicios;

import java.util.Scanner;

public class Exercicio1_30 {

	public static void main(String[] args) {
		
//		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//		mensagem explicativa
		
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro:");
		x = sc.nextInt();
		System.out.println("Digite outro valor inteiro:");
		y = sc.nextInt();
		System.out.println("Soma: " +  (x + y));
		sc.close();
	}
}