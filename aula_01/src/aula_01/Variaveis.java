package aula_01;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		String nome;
		double area;

		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();

		System.out.println("Digite um nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("Digite um numero real: ");
		area = leia.nextDouble();

		System.out.println("O nome da participante é: " + nome);
		System.out.println("O número é: " + numero);
		System.out.printf("A área é: %.2f\n", area);

		System.out.println("A área é: " + area);

		leia.close();
		
	}

}
