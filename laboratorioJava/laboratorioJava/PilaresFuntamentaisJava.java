package laboratorioJava;

import java.util.Scanner;

public class PilaresFuntamentaisJava {

	static class Fruta {

		private String cor;

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getCor() {
			return cor;
		}

		void verificaFruta(Banana banana) {
			System.out.println("Está estragada!");
		}
	}

	static class Banana extends Fruta {

		public Banana(String cor) {
			setCor(cor);
		}

		@Override
		void verificaFruta(Banana banana) {

			if (banana.getCor() != null && banana.getCor().equalsIgnoreCase("Amarelo")) {
				System.out.println("Está boa para consumo.");
				return;
			} 
			super.verificaFruta(banana);
		}
	}

	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Qual a cor da Banana? ");
		Banana banana = new Banana(sc.next());

		banana.verificaFruta(banana);
		sc.close();
	}
}