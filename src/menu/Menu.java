package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int escolha;

		while (true) {

			System.out.println("-------------------------------------------------");
			System.out.println("                                                 ");
			System.out.println("                   Miualandia                    ");
			System.out.println("                                                 ");
			System.out.println("-------------------------------------------------");
			System.out.println("                                                 ");
			System.out.println("          1 - Cadastre-se                        ");
			System.out.println("          2 - Roupas                             ");
			System.out.println("          3 - Brinquedos                         ");
			System.out.println("          4 - Alimentos (Rações e petiscos)      ");
			System.out.println("          5 - Banho                              ");
			System.out.println("          6 - Sair                               ");
			System.out.println("                                                 ");
			System.out.println("-------------------------------------------------");
			System.out.println("Entre com a opção desejada:                      ");
			System.out.println("                                                 ");

			escolha = leia.nextInt();

			if (escolha == 9) {
				System.out.println("\nMiualandia - Seu conforto está no ronron!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (escolha) {
			case 1:
				System.out.println("Cadastre-se\n\n");

				break;
			case 2:
				System.out.println("Roupas\n\n");

				break;
			case 3:
				System.out.println("Brinquedos\n\n");

				break;
			case 4:
				System.out.println("Alimentos (Rações e petiscos)\n\n");

				break;
			case 5:
				System.out.println("Banho\n\n");

				break;
			default:
				System.out.println("Opção inválida\n\n");
				break;
			}

		}

	}

	public static void sobre() {
		System.out.println("\n-------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: Maria Eduarda de Oliveira Costa");
		System.out.println("Maria Eduarda - maria.oliveiracosta2203@gmail.com");
		System.out.println("https://github.com/mariacosta2203");
		System.out.println("\n-------------------------------------------------");
	}

	}


