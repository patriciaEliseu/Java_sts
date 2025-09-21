package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
				
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");
		
		System.out.println(fila);
		
		// Retirar um elemento da Fila
		fila.remove();
		
		System.out.println(fila);
		
		fila.add("Milena");
		fila.add("Nadia");
		
		System.out.println(fila);
		
		System.out.println("O tamanho da fila é: " + fila.size());
		
		System.out.println("A primeira pessoa da fila é: " + fila.peek());
		
		for(var pessoa : fila) {
			System.out.println(pessoa);
		}
	}

}