package models;

public class Moto extends Automovel{


    @Override
    public String toString() {
        return "Placa: " + getPlaca() + " | Cor:" + getCor() +  "Modelo: " + getModelo();
    }
}
