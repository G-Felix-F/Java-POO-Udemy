package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		String nomeMaisVelho = "";
		int idadeMaisVelho = idades[0];
		
		for(int i = 0; i < nomes.length; i++) {
			if(idadeMaisVelho < idades[i]) {
				idadeMaisVelho = idades[i];
				nomeMaisVelho = nomes[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
		
		sc.close();
	}
}