package views;
import models.Automovel;

import utils.Console;
public class EntradaAutomovel {
    public void renderizar() {
		
		System.out.println("\n **** ENTRADA DO AUTOMOVEL **** \n");
		    Automovel carro = new Automovel();
			Automovel moto = new Automovel();

            carro.setPlaca(Console.readString("Digite a Placa do Carro: "));
			System.out.println();
			moto.setPlaca(Console.readString("Digite a Placa da moto: "));
		
		}
}
