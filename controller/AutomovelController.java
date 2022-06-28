package controller;
import java.util.ArrayList;
import models.Automovel;
import models.Carro;
import models.Moto;
public class AutomovelController {

        private static ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
        private static ArrayList<Carro> carros = new ArrayList<Carro>();
        private static ArrayList<Moto> motos = new ArrayList<Moto>();
    
        
        public void cadastrar(Automovel automovel) {
            automoveis.add(automovel);
        }
   
        public ArrayList<Automovel> listar(){
            return automoveis;
        }
        public ArrayList<Automovel> listarCarro(){
            return automoveis;
        }
        public ArrayList<Automovel> listarMoto(){
            return automoveis;
        }
        public boolean cadastrarCar(Carro carro){
            if( (buscarPorPlaca(carro.getPlaca()) == null))  {
                carros.add(carro);
                return true;
            }
            return false;
        }
        public boolean cadastrarMoto(Moto moto){
            if( (buscarPorPlaca(moto.getPlaca()) == null))  {
                motos.add(moto);
                return true;
            }
            return false;
        }
    
        
        public Automovel buscarPorPlaca(String placa){
            for (Automovel automovelCadastrado : automoveis) {
                if(automovelCadastrado.getPlaca().equals(placa)){
                    return automovelCadastrado;
                }
            }
            return null;
        }
        
        
        
    
}

