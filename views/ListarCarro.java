package views;

import controller.AutomovelController;
import models.Automovel;



public class ListarCarro {
    public void renderizar() {
    AutomovelController  controllerAutomovel = new AutomovelController();
    System.out.println("\n **** LISTAGEM DE CARRO **** \n");
    for (Automovel automovel : controllerAutomovel.listarCarro()) {
                    System.out.println(automovel);
        }
            
    }
    
}

