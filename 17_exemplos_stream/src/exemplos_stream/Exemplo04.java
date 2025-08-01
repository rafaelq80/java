package exemplos_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo04 {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList(
			    "São Paulo", 
			    "Rio de Janeiro", 
			    "Minas Gerais",
			    "Espirito Santo", 
			    "São Paulo", 
			    "Rio de Janeiro", 
			    "Minas Gerais", 
			    "São Paulo", 
			    "Rio de Janeiro"
			);
		
		System.out.println("\nExemplo - Método Distinct");
		 
		 List<String> estadosSemRepeticao = estados.stream()
				 .distinct()
				 .collect(Collectors.toList());
				     
		 System.out.println("\nExibir os Estados sem repetição: " + estadosSemRepeticao);

	}

}
