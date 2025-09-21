package repeticoes;

import java.util.Scanner;


public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, esporte, futebol = 0, voleiM18 = 0, basquetem18 = 0;
		long soma_idades = 0;
		double media_idades = 0;
		int total_respostas = 0;
		String continua = "S";
		
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte Favorito");
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			System.out.println("Digite o seu esporte favorito: ");
			esporte = leia.nextInt();
			
			//Total de pessoas que gostam de futebol
			if(esporte == 1) {
				futebol ++;
			}
			
			// Total de pessoas que gostam de voleibol e são maiores de 18 anos
			if(esporte == 2 && idade >= 18) {
				voleiM18 ++;
			}
			
			// Total de pessoas que gostam de basquetebol e são menores de 18 anos
			if(esporte == 3 && idade < 18) {
				basquetem18 ++;
			}
			
			soma_idades += idade;
			total_respostas ++;
			
									
			System.out.println("Deseja continuar (S/N)?");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		media_idades = Math.round(soma_idades / total_respostas);
		
		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de voleibo maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de basquetebol menores de 18 anos: %d%n", basquetem18);
		System.out.printf("Media de idades: %2f%n ", media_idades);
		
		leia.close();
		
		
			
		
	}

}
