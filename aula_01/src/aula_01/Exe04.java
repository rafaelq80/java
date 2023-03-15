package aula_01;

import java.util.Scanner;

public class Exe04 {
		
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, resultado;
		
		System.out.println("Digite o 1º numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o 2º numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o 3º numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o 4º numero: ");
		n4 = leia.nextFloat();

		resultado = (n1 * n2) - (n3 * n4);

		System.out.println("O resultado da Operação é: " + resultado);
		
		leia.close();
		
	}

}
