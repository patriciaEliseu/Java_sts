package arrays;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];

		String diagonalPrincipal = "", diagonalSecundaria = "";
		
		int somaPrincipal = 0, somaSecundaria = 0;
		
		for(int linha = 0; linha < matriz.length; linha ++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		// Diagonal Principal
		// Listar e somar os elementos da Diagonal Principal
		// Na Diagonal principal os índices dos elementos são iguais
		// Exemplo: 0,0
		for(int indice = 0; indice < matriz.length; indice ++) {
			diagonalPrincipal += matriz[indice][indice] + " ";
			somaPrincipal += matriz[indice][indice];
		}
		
		// Diagonal Secundária
		// Listar e somar os elementos da Diagonal Secundária
		// Na Diagonal secundária o índice da coluna é o resultado entre o
		// tamanho da linha - 1 - indice da linha
		// Exemplo: 2,0 => tamanho da linha (3) - 1 - indice da linha (2)
		for(int indice = 0; indice < matriz.length; indice ++) {
			diagonalSecundaria += matriz[indice][matriz.length - 1 - indice] + " ";
			somaSecundaria += matriz[indice][matriz.length - 1 - indice];
		}
		
		System.out.println("Diagonal Principal: " + diagonalPrincipal);
		System.out.println("Diagonal Secundária: " + diagonalSecundaria);
		System.out.println("Soma dos elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos elementos da Diagonal Secundária: " + somaSecundaria);
		
		leia.close();
	}

}