package views;

import utils.Console;
public class Principal{
    public static void main(String[] args) throws InterruptedException {

        int opcao = 0;

        do {
            System.out.println("\n -- PROJETO DE AUTOMOVEL -- \n");
            System.out.println("1 - Cadastro do Automovel");
            System.out.println("2 - Entrada do Automovek");
            System.out.println("4 - Lista dos Carros");
            System.out.println("5 - Lista das Motos");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarAutomovel cadastrarAutomovel = new CadastrarAutomovel();
                    cadastrarAutomovel.renderizar();
                    break;
                case 2:
                    EntradaAutomovel entradaAutomovel = new EntradaAutomovel();
                    entradaAutomovel.renderizar();
                    break;
                case 4:
                    ListarCarro listarCarro = new ListarCarro();
                    listarCarro.renderizar();
                    break;
                case 5:
                    ListarMoto listarMoto = new ListarMoto();
                    listarMoto.renderizar();
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    } 
        
}
