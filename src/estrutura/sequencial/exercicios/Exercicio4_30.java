package estrutura.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_30 {

	public static void main(String[] args) {
		
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//		decimais.
		
		Locale.setDefault(Locale.US);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorPorHora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número do Funcionário: ");
		numeroFuncionario = sc.nextInt();
		System.out.print("Horas Trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Valor por Hora: ");
		valorPorHora = sc.nextDouble();
		System.out.printf("Código do Funcionário: %d%nSalário do Funcionário: U$%.2f", numeroFuncionario, (horasTrabalhadas * valorPorHora));
		sc.close();
	}
}