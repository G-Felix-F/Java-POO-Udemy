package capitulo6.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio7_54 {

	public static void main(String[] args) {
		
//	Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//	começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//	exemplo.
	
//	1 1 1
//	2 4 8
//	3 9 27
//	4 16 64
//	5 25 125
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro:");
		int inteiro = sc.nextInt();
		
		for(int i = 1; i < inteiro + 1; i++) {
			
			System.out.print(i + ", " + i * i + ", " + i * i * i + "\n");
		}
		sc.close();
	}
}