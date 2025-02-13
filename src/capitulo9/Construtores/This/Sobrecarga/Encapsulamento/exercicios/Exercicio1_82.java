package capitulo9.Construtores.This.Sobrecarga.Encapsulamento.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_82 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BancaryAccount b = null;
		double deposit;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char choose = sc.next().charAt(0);

		if (choose == 'y') {
			System.out.print("Enter initial deposit value? U$");
			deposit = sc.nextDouble();
			b = new BancaryAccount(accountNumber, name, deposit);
			
		} else if (choose == 'n') {
			
			b = new BancaryAccount(accountNumber, name);
		}
		
		System.out.println("Account data:\n" + b);

		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();
		b.deposit(deposit);

		System.out.println("Updated account data:\n" + b);
		System.out.println("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		b.withdraw(deposit);
		System.out.println("Updated account data:\n" + b);

		sc.close();
	}
}