package laboratorioJava;

public class PilaresFuntamentaisJava {

	static class Fruta {

		private String cor;

		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public String getCor() {
			return cor;
		}

		void verificaBanana(Banana banana) {
			System.out.println("Verificação padrão da fruta.");
		}
	}

	static class Banana extends Fruta {
		
		public Banana(String cor) {
			setCor(cor);
		}

		@Override
		void verificaBanana(Banana banana) {

			super.verificaBanana(banana);

			if (banana.getCor() != null && !banana.getCor().equals("Amarelo")) {
				System.out.println("Está estragada!");
			} else {
				System.out.println("Está boa para consumo.");
			}
		}
	}

	public static void main(String[] args) {
		Banana banana = new Banana("Amarelo");

		banana.verificaBanana(banana);
	}

}