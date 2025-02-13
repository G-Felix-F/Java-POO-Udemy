package estrutura.sequencial;

import java.util.Scanner;

public class EntradaDeDados27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;

//		x = sc.nextInt();		Quando se usa um comando de leitura diferente do nextLine()
//		s1 = sc.nextLine();		e dá alguma quebra de linha, essa quebra de linha fica pendente
//		s2 = sc.nextLine();		na entrada padrão. Então o próximo nextLine() receberá essa quebra
//		s3 = sc.nextLine();		de linha pendente.
		
		x = sc.nextInt();	 
		sc.nextLine();		 // Então criamos um nextLine() que receberá
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS CADASTRADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}