package exemplos_stream;

import java.util.Arrays;
import java.util.List;

public class Exemplo11 {

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
		
		System.out.println("\nExemplo - Método ForEach");
		
		System.out.println("\nEstados cujo nome iniciam com a letra S:");
		
		estados.stream()
		        .filter(x-> x.startsWith("S"))
		        .forEach(System.out::println);
		
	}

}
