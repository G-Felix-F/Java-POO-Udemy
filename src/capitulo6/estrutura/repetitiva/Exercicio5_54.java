package capitulo6.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio5_54 {

	public static void main(String[] args) {
		
//		Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//		Lembrando que, por definição, fatorial de 0 é 1.
//		4! 4*3*2*1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Inteiro Fatorial:");
		int inteiro = sc.nextInt();
		int fatorial = 1;
		
		for(int i = 1; i <= inteiro; i++) {
			
			fatorial = fatorial * i;
		
			System.out.println(i);
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}
}