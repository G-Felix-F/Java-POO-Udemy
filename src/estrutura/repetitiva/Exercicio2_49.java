package estrutura.repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_49 {

	public static void main(String[] args) {

//		Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

		Locale.setDefault(Locale.US);

		double x = 1, y = 1;

		Scanner sc = new Scanner(System.in);

		while (x != 0 && y != 0) {

			System.out.print("Coordenada X: ");
			x = sc.nextDouble();
			System.out.print("Coordenada Y: ");
			y = sc.nextDouble();
			
			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");
			}
			if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			}
			if (x < 0 && y < 0) {
				System.out.println("Quadrante 3");
			}
			if (x > 0 && y < 0) {
				System.out.println("Quadrante 4");
			}
		}

		sc.close();
	}
}