package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

import capitulo10.comportamentoMemoria.array.listas.vetores.entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		double media = 0;

		Pessoa[] vetor = new Pessoa[n];
		String nomeMenorIdade = "";
		double contaMenorIdade = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();

			if (idade < 16) {
				nomeMenorIdade += nome + "\n";
				contaMenorIdade++;
			}

			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoa(nome, idade, altura);
		}

		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i].getAltura();
		}

		System.out.printf("Altura média: %.2f %n", media / vetor.length);
		contaMenorIdade = contaMenorIdade * 100 / vetor.length;
		System.out.println("Pessoas com menos de 16 anos: " + contaMenorIdade + "%");
		System.out.println(nomeMenorIdade);

		sc.close();
	}
}