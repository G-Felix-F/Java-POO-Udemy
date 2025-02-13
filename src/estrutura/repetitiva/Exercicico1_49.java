package estrutura.repetitiva;

import java.util.Scanner;

public class Exercicico1_49 {

	public static void main(String[] args) {

//		Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

		int senha = 2002;
		int tentativa = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua Senha: ");
		tentativa = sc.nextInt();

		while (tentativa != senha) {

			System.out.print("Senha Incorreta! Digite sua Senha: ");
			tentativa = sc.nextInt();

		}
		
		System.out.println("Senha Correta!");
	}
}