package capitulo4.estrutura.sequencial;

public class Casting25 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		double resultado;
		
		resultado = (double) a / b;  //quando se divide 2 inteiros, o java atribui do resultado como inteiro (tirando as casas decimais)
									 // é necessario o casting para transformar o resultado da divisao inteira em double
		
		System.out.println(resultado);
		
		double c;
		int d;
		
		c = 5;
		d = (int) c;  // o casting informa ao compilador que não se importa na perda de dados decimais 
					  // ao atribuir um valor double para uma variavel inteira
		
		System.out.println(d);
	}
}