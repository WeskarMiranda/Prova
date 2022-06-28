package views;
import controller.AutomovelController;
import models.Automovel;

public class ListarMoto {
    public void renderizar() {
        AutomovelController  controllerAutomovel = new AutomovelController();
        System.out.println("\n **** LISTAGEM DE MOTO **** \n");
        
        for (Automovel automovel : controllerAutomovel.listarMoto()) {
            System.out.println(automovel);
        }
            
        
    }
}
