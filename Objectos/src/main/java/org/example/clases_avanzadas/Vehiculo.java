package org.example.clases_avanzadas;

public abstract class Vehiculo {
    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public void imprimirInfo() {
        System.out.println("Vehiculo de la marca " + this.marca + " con matricula " + this.matricula);
    }

    public void ruido() {
        System.out.println("Piii piii");
    }

}



