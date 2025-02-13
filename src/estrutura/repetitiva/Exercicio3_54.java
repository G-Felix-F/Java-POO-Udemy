package estrutura.repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_54 {

	public static void main(String[] args) {
		
//		Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//		peso 5.
		
//		3
//		6.5 4.3 6.2
//		5.1 4.2 8.1
//		8.0 9.0 10.0
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de testes: ");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5);
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}
}