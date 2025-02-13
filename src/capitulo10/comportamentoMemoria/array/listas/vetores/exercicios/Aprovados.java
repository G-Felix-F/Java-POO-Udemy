package capitulo10.comportamentoMemoria.array.listas.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		String aprovados = "";
				
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			nomes[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			
			if((nota1[i] + nota2[i]) / 2 >= 6) {
				aprovados += nomes[i] + "\n";
			}
		}
		System.out.println("Alunos aprovados: \n" + aprovados);
		
		sc.close();
	}
}