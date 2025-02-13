package capitulo4.estrutura.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_30 {

	public static void main(String[] args) {
		
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos.
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159
		
		Locale.setDefault(Locale.US);
		
		double raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Raio do Círculo:");
		raio = sc.nextDouble();
		raio = 3.14159 * Math.pow(raio, 2);
		System.out.printf("Valor da Área: %.4f", raio);
		sc.close();
	}
}