package capitulo4.estrutura.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_30 {

	public static void main(String[] args) {
		
//		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//		a) a área do triângulo retângulo que tem A por base e C por altura.
//		b) a área do círculo de raio C. (pi = 3.14159)
//		c) a área do trapézio que tem A e B por bases e C por altura.
//		d) a área do quadrado que tem lado B.
//		e) a área do retângulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		
		double valorA, valorB, valorC, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		valorA = sc.nextDouble();
		System.out.println("Digite o valor B: ");
		valorB = sc.nextDouble();
		System.out.println("Digite o valor C: ");
		valorC = sc.nextDouble();
		
		areaTriangulo = valorA * valorC / 2;
		System.out.printf("Área do Triângulo: %.3f%n", areaTriangulo);
		
		areaCirculo = Math.pow(valorC, 2) * 3.14159;
		System.out.printf("Área do Círculo: %.3f%n", areaCirculo);
		
		areaTrapezio = (valorA + valorB) * valorC / 2;
		System.out.printf("Área do Trapézio: %.3f%n", areaTrapezio);
		
		areaQuadrado = Math.pow(valorB, 2);
		System.out.printf("Área do Quadrado: %.3f%n", areaQuadrado);
		
		areaRetangulo = valorA * valorB;
		System.out.printf("Área do Triângulo: %.3f%n", areaRetangulo);
		sc.close();
	}
}