package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		try {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();

			validarIdade(idade);
		} catch (ExcecaoSimples e) {
			System.out.println("A pessoa não está apta a dirigir!");
		}

	}

	public static void validarIdade(int idade) throws ExcecaoSimples {

		if (idade > 18)
			System.out.println("A Pessoa pode dirigir!!");
		else
			throw new ExcecaoSimples("A Pessoa não pode dirigir");

	}

}
