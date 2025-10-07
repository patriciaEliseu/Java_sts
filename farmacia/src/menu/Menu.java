package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
import farmacia.controller.ProdutoController;
import farmacia.model.Cosmetico;
import farmacia.model.Medicamento;
import farmacia.model.Produto;
*/
import util.Cores;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);

	// private static final ProdutoController produtoController = new
	// ProdutoController();

	public static void main(String[] args) {

		int opcao;

		// criarProdutosTeste();

		/*
		 * Medicamento m1 = new Medicamento(1, "Paracetamol 750mg", 1, 20.00f,
		 * "Paracetamol"); m1.visualizar();
		 * 
		 * Cosmetico c1 = new Cosmetico(1, "Sabonete Lux", 2, 4.00f, "Flores do Campo");
		 * c1.visualizar();
		 */

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                FARMACIA BEM-ESTAR                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 8");
				leia.nextLine();
			}

			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nFarmácia Bem-Estar - Medicamentos Barato é aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Produto\n\n");

				//cadastrarProduto();

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Produtos\n\n");

				//listarProdutos();

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados do Produto - por ID\n\n");

				//procurarProdutoPorId();

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do Produto\n\n");

				//atualizarProduto();

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar o Produto\n\n");
				//deletarProduto();
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Patrícia Gonçalves Eliseu");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/patriciaEliseu");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();
	}

	
}