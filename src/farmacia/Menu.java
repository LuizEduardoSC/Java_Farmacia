package farmacia;

import java.util.Scanner;


		public class Menu {

			public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);
				
				int opcao;
				
				while (true) {
					
				System.out.println();
				
				System.out.println("*************************************************");		
				System.out.println("                                                 ");		
				System.out.println("              FARMÁCIA - BOM PREÇO               ");		
				System.out.println("                                                 ");		
				System.out.println("*************************************************");		
				System.out.println("                                                 ");
				System.out.println("          1 - Criar Produto                      ");
				System.out.println("          2 - Listar todos os Produtos           ");
				System.out.println("          3 - Buscar Produto por Número          ");
				System.out.println("          4 - Atualizar Dados de um Produto      ");
				System.out.println("          5 - Apagar Produto                     ");
				System.out.println("          6 - Sair                               ");
				System.out.println("                                                 ");		
				System.out.println("*************************************************");
				System.out.println("Entre com a opção desejada                       ");
				System.out.println("                                                 ");
				
				opcao = leia.nextInt();
				
				if(opcao == 6) {
					System.out.println( "\nFarmácia Bom Preço - O Melhor preço é aqui!");
					sobre();
					leia.close();
					System.exit(0);
				}
				
				switch (opcao) {
				case 1: System.out.println( "Criar Produto\n\n");
				break;
				
				case 2: System.out.println( "Listar todas os Produtos\n\n");
				break;
				
				case 3: System.out.println( "Consultar dados de um Produto - por id \n\n");
				break;
				
				case 4: System.out.println( "Atualizar dados de um Produto\n\n");
				break;
				
				case 5: System.out.println( "Apagar Produtoa\n\n");
				break;
				
				
				default:
					System.out.println(  "\nOpção Inválida! \n" );
					break;
				}

			}
			}
			public static void sobre() {
				System.out.println("\n*************************************************");
				System.out.println("Projeto Desenvolvido por: Luiz Eduardo!");
				System.out.println("Luiz Eduardo - luizeduardoedd1@gmail.com");
				System.out.println("github.com/LuizEduardoSC");
				System.out.println("*************************************************");
			}

	}
