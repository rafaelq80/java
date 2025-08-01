package exemplos_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo03 {

	public static void main(String[] args) {

		List<Integer> numerosNaoOrdenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);

		System.out.println("\nExemplo - Método Sorted");
		 
		 List<Integer> numerosOrdenadosAsc = numerosNaoOrdenados.stream()
				 .sorted()
				 .collect(Collectors.toList());

		 System.out.println("\nExibir os Numeros em Ordem Crescente: " + numerosOrdenadosAsc);
		 
		 List<Integer> numerosOrdenadosDesc = numerosNaoOrdenados.stream()
				 .sorted(Comparator.reverseOrder())
				 .collect(Collectors.toList());

		 System.out.println("\nExibir os Numeros em Ordem Decrescente: " + numerosOrdenadosDesc);
		 
	}

}
