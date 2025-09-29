package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numerosDesordenados = Arrays.asList(6, 7, 8, 1, 4, 5, 9, 10, 2, 3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro", "rio grande do sul");

		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());

		System.out.println("Números pares: " + numerosPares);
		System.out.println("Coleção original: " + numeros);

		estados.stream().filter(e -> e.toUpperCase()
				.startsWith("R")).distinct() // => elimina repeticoes
				.forEach(System.out::println);
		
		List<Double> numerosAoCubo = numeros.stream()
				.map(n -> Math.pow(n, 3))
				.collect(Collectors.toList());
		
		System.out.println("Numeros elevados ao cubo (Double): " + numerosAoCubo);

		List<Integer> numerosAoCuboInteiros = numeros.stream()
				.map(n -> (int) Math.pow(n, 3))
				.collect(Collectors.toList());
		
		System.out.println("Numeros elevados ao cubo (Integer): " + numerosAoCuboInteiros);
		
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted().collect(Collectors.toList());
		
		System.out.println("Numeros Ordenados: " + numerosOrdenados);
		
		long estadosIniciandoEmR= estados.stream().filter(e -> e.toUpperCase()
				.startsWith("R")).distinct() // => elimina repeticoes
				.count();
		
		System.out.println("Total de Estados iniciados com a letra R: " + estadosIniciandoEmR);
		
	}

}