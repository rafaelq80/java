package aula_01;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int quantidade;
		long identificador;
		float altura; 
		double area;
		char tipo;
		String frase;
		boolean ativo;
		
		System.out.println("\nDigite um valor para a Variável quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("\nDigite um valor para a Variável identificador (long): ");
		identificador = leia.nextLong();
		
		System.out.println("\nDigite um valor para a Variável altura (float): ");
		altura = leia.nextFloat();
		
		System.out.println("\nDigite um valor para a Variável area (double): ");
		area = leia.nextDouble();

		System.out.println("\nDigite um valor para a Variável tipo (char): ");
		tipo = leia.next().charAt(0);
				
		System.out.println("\nDigite um valor para a Variável frase (String): ");
		leia.skip("\\R?");
		frase = leia.nextLine();
		
		System.out.println("\nDigite um valor para a Variável ativo (boolean): ");
		ativo = leia.nextBoolean();
		
		System.out.println("\nDados recebidos via teclado:\n");
		
		System.out.println("\nVariável quantidade = " + quantidade);
		System.out.println("\nVariável identificador = " + identificador);
		System.out.println("\nVariável altura = " + altura);
		System.out.println("\nVariável area = " + area);
		System.out.println("\nVariável tipo = " + tipo);
		System.out.println("\nVariável palavra = " + frase);
		System.out.println("\nVariável tamanho = " + ativo);
		
		leia.close();
	}

}
