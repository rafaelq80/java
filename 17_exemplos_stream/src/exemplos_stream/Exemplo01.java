package exemplos_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo01 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("\nExemplo - Método Map");

		List<Integer> numerosAoCubo = numeros.stream()
					.map(n -> (int) Math.pow(n, 3))
					.collect(Collectors.toList());

		System.out.println("\nNumeros elevados ao Cubo: " + numerosAoCubo);

	}

}
