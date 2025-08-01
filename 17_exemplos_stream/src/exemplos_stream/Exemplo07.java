package exemplos_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo07 {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList(
			    "São Paulo", 
			    "Rio de Janeiro", 
			    "Minas Gerais", 
			    "Espirito Santo", 
			    "Rio Grande do Sul", 
			    "Santa Catarina", 
			    "Paraná"
			);
		
		System.out.println("\nExemplo - Método Terminal Collect");
		
		List <String> estadosIniciadosEmR = estados.stream()
		        .filter(e-> e.startsWith("R"))
		        .sorted()
		        .collect(Collectors.toList());

		System.out.println("\nEstados cujo nome começam com a letra R: " + estadosIniciadosEmR);

	}

}
