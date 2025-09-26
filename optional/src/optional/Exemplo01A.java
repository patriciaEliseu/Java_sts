package optional;

import java.util.Optional;
import java.util.Scanner;

public class Exemplo01A {
	
	
	 
	public class Exemplo1 {
	 
		public static void main(String[] args) {
			String[] palavras = new String[10];
			Scanner leia = new Scanner (System.in);
			
			for (int i = 0; i < 10; i++) {
				System.out.printf("%nDigite a %d palavra: ", i+1);
				palavras [i] = leia.next();		
			}
			
			for (var palavra : palavras) {
				System.out.println(palavra);
			}
			
			Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
			
			if (checaNulo.isPresent()) {
		
			String palavra = palavras[5].toLowerCase();
			System.out.printf("\n\nPassando a palavra 5 para letras minúsculas: ", palavra);
			
			} else {
				System.out.println("O valor é nulo!");		}
		}
	}
	 
}
