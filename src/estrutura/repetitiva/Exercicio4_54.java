package estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio4_54 {

	public static void main(String[] args) {
		
//		Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade:");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			
			if(valor2 == 0) {
				System.out.println("Divisão Impossível!");
			}
			else {
				double divisao = valor1 / valor2;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
	}
}