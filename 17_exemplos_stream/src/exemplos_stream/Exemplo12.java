package exemplos_stream;

import java.util.Arrays;
import java.util.List;

public class Exemplo12 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("\nExemplo - Método Reduce");

		int soma = numeros.stream()
		    .reduce(0, Integer::sum);

		System.out.println("\nSoma dos números: " + soma);

	}

}
