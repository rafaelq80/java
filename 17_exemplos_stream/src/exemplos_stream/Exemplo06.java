package exemplos_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo06 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("\nExemplo - Método Skip");

		List<Integer> ignorarCinco = numeros.stream()
		    .skip(5)
		    .collect(Collectors.toList());

		System.out.println("\nIgnorar os 5 primeiros números: " + ignorarCinco);

	}

}
