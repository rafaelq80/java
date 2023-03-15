package aula_01;

public class ExibirVariaveis {

	public static void main(String[] args) {
		
		int quantidade = 1000;
		long identificador = 10000l;
		float altura = 25.4f; 
		double area = 45.4567;
		double tamanho = 650000000.00;
		char tipo = 'A';
		String palavra = "Generation";
		 
		System.out.printf("\nVariável quantidade = %d", quantidade);
		System.out.printf("\nVariável identificador = %d", identificador);
		System.out.printf("\nVariável altura = %.2f", altura);
		System.out.printf("\nVariável area = %.2f", area);
		System.out.printf("\nVariável tamanho = %e", tamanho);
		System.out.printf("\nVariável tamanho = %E", tamanho);
		System.out.printf("\nVariável tipo = %c", tipo);
		System.out.printf("\nVariável palavra = %s", palavra);

	}

}