
package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, esporte, totalRespostas = 0, futebol = 0, voleiM18 = 0, basquetem18 = 0;

		long somaIdades = 0;

		double mediaIdades = 0;

		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Pesquisa - Esporte Favorito");

			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");

			do {
				System.out.println("Digite a seu esporte favorito: ");
				esporte = leia.nextInt();
				
				if(esporte < 1 || esporte > 3) {
					System.out.println("Digite um valor entre 1 e 3");
				}
				
			} while (esporte < 1 || esporte > 3);


			// Total de pessoas que gostam de futebol
			if (esporte == 1) {
				futebol++;
			}

			// Total de pessoas que gostam de voleibol e são maiores de 18 anos
			if (esporte == 2 && idade >= 18) {
				voleiM18++;
			}

			// Total de pessoas que gostam de basquetebol e são menores de 18 anos
			if (esporte == 3 && idade < 18) {
				basquetem18++;
			}

			somaIdades += idade;

			totalRespostas++;

			leia.skip("\\R");

			do {
				System.out.println("Deseja continuar (S/N)?");
				continua = leia.nextLine().toUpperCase();
			} while (!continua.equals("S") && !continua.equals("N"));

		}

		mediaIdades = Math.round(somaIdades / totalRespostas);

		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de basquetebol menores de 18 anos: %d%n", basquetem18);
		System.out.printf("Média das idades: %.2f%n", mediaIdades);

		leia.close();

	}

}
