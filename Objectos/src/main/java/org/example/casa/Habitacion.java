package org.example.casa;

public class Habitacion {
    private String nombre;
    private double metrosCuadrados;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Habitación: " + nombre + ". Tamaño (m²): " + metrosCuadrados;
    }
}
