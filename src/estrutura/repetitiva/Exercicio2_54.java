package estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio2_54 {

	public static void main(String[] args) {

//		Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade para ser lida:");
		int quantidade = sc.nextInt();
		int in = 0, out = 0;

		for (int i = 0; i < quantidade; i++) {

			System.out.println("Digite um valor inteiro:");
			int inteiro = sc.nextInt();

			if (inteiro <= 20 && inteiro >= 10) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in\n" + out + " out");

		sc.close();
	}
}