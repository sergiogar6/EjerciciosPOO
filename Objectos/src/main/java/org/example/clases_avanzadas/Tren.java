package org.example.clases_avanzadas;

public class Tren extends Vehiculo {

    private int vagones;

    public Tren(String marca, String matricula, int vagones) {
        super(marca, matricula);
        this.vagones = vagones;
    }

    public void ruido(){
        System.out.println("chu chu");
    }
}
