package models;

public class Carro extends Automovel {



    @Override
    public String toString() {
        return "Placa: " + getPlaca() + " | Cor:" + getCor() +  " | Modelo: " + getModelo();
    }

}
    