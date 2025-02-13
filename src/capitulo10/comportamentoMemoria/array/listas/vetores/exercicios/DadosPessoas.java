package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i < altura.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			String generoString = sc.next();
			genero[i] = generoString.charAt(0);
		}
		
		double alturaMaior = altura[0];
		double alturaMenor = altura[0];
		
		for (int i = 0; i < altura.length; i++) {
			if(alturaMaior < altura[i]) {
				alturaMaior = altura[i];
			}
			
			if(alturaMenor > altura[i]) {
				alturaMenor = altura[i];
			}
		}
		
		double mediaMulher = 0;
		int quantidadeMulheres = 0;
		int quantidadeHomens = 0;
		
		for (int i = 0; i < altura.length; i++) {
			if(genero[i] == 'F') {
				mediaMulher += altura[i];
				quantidadeMulheres++;
			}
			
			if(genero[i] == 'M') {
				quantidadeHomens++;
			}
		}
		
		mediaMulher = mediaMulher / quantidadeMulheres;
		
		System.out.printf("%nMenor Altura = %.2f", alturaMenor);
		System.out.printf("%nMaior Altura = %.2f", alturaMaior);
		System.out.printf("%nMedia das alturas das mulheres = %.2f%n", mediaMulher);
		System.out.println("Número de Homens = " + quantidadeHomens);
		
		sc.close();
	}
}