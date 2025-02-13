package capitulo9.Construtores.This.Sobrecarga.Encapsulamento.exercicios;

public class BancaryAccount {

	private int accountNumber;
	private String name;
	private double deposit;
	
	public BancaryAccount(int accountNumber, String name, double deposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(deposit);
	}
	
	public BancaryAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}
	
	public void deposit(double deposit) {
		this.deposit += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.deposit -= withdraw + 5;
	}
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + String.format(", Balance: $%.2f", deposit);
	}
	
}