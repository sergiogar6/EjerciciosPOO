package org.example.casa;

import java.util.ArrayList;

public class Habitacion {
    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.electrodomesticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void agregarElectrodomestico(String nombre, int consumo) {
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico.getNombre().equals(nombre)) {
                System.out.println("El electrodomestico ya existe");
                return;
            }
        }
        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo); //solamente la Casa crea las habitaciones
        electrodomesticos.add(electrodomestico);
    }

    public void mostrarElectrodomesticos() {
        System.out.println("Habitacion " + nombre + " tiene los siguientes electrodomesticos: " + electrodomesticos.size());

        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println("- " + electrodomestico.getNombre() + "(" + electrodomestico.getConsumo() + " kWh)");
        }
    }

    public double calcularConsumo() {
        int consumo = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            consumo += electrodomestico.getConsumo();
        }
        return consumo;
    }

    @Override
    public String toString() {
        return "Habitación: " + nombre + ". Tamaño (m²): " + metrosCuadrados + ". Consumo: " + calcularConsumo();
    }
}
