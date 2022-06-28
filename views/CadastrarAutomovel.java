package views;

import models.Automovel;
import controller.AutomovelController;
import utils.Console;
public class CadastrarAutomovel {
    public void renderizar() {
		
		System.out.println("\n **** CADASTRO DE AUTOMOVEL **** \n");
            
		    Automovel carro = new Automovel();
			Automovel moto = new Automovel();
			AutomovelController automovelController = new AutomovelController();
            
			carro.setModelo(Console.readString("Digite o Modelo do Carro: "));
			carro.setCor(Console.readString("Digite a Cor do Carro: "));
            carro.setPlaca(Console.readString("Digite a Placa do  Carro: "));
            automovelController.cadastrar(carro);
			System.out.println("\nCarro cadastrado!");
			System.out.println();
			moto.setModelo(Console.readString("Digite o Modelo da Moto: "));
			moto.setCor(Console.readString("Digite a Cor da Moto: "));
            moto.setPlaca(Console.readString("Digite a Placao da Moto: "));
            automovelController.cadastrar(moto);
			System.out.println("\nMoto cadastrada!");

		
		}
}
