package colecoes;

import java.util.ArrayList;
import java.util.Comparator;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		/*for(int contador = 1; contador <= 10; contador ++) {
			numeros.add(contador);
		}*/
		
		System.out.println(numeros);
		
		// Ordenação Crescente
		numeros.sort(null);
		
		System.out.println(numeros);
		
		// Ordenação Decrescente
		numeros.sort(Comparator.reverseOrder());
		
		System.out.println(numeros);
		
		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));
		
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		numeros.set(numeros.indexOf(10), 4);
		
		System.out.println(numeros);
		
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		numeros.remove(numeros.indexOf(5));
		
		System.out.println(numeros);
		
		// For Each
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Tamanho da lista: " + numeros.size());
		
		System.out.println("A lista está vazia? " + numeros.isEmpty());
		
		System.out.println("O numero 8 está na lista? " + numeros.contains(8));
		
		// Limpar a lista
		numeros.clear();
		
		System.out.println("A lista está vazia? " + numeros.isEmpty());
	}

}