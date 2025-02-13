package capitulo6.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio6_54 {

	public static void main(String[] args) {
		
//		Ler um número inteiro N e calcular todos os seus divisores.
		
//		6  5
//		
//		1  1
//		2  5
//		3
//		6
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro:");
		int valor = sc.nextInt();
		
			for(int i = 1; i <= valor; i++) {
				if(valor % i == 0) {
					System.out.println(i);
				}
			}

		
		sc.close();
	}
}