package capitulo6.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio3_49 {

	public static void main(String[] args) {
		
//		Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//		exemplo.
		
		int contador = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (contador != 4) {
			
			System.out.println("1- Álcool, 2- Gasolina, 3- Diesel, 4- Fim");
			contador = sc.nextInt();
			
			if (contador > 4 || contador < 1) {
				System.out.println("1- Álcool, 2- Gasolina, 3- Diesel, 4- Fim");
				contador = sc.nextInt();
			}
			
			if (contador == 1) {
				alcool += 1;
			}
			if (contador == 2) {
				gasolina += 1;
			}
			if (contador == 3) {
				diesel += 1;
			}
		}
		
		System.out.printf("MUITO OBRIGADO%n%nÁlcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
	}
}