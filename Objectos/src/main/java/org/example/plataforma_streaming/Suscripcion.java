package org.example.plataforma_streaming;

public abstract class Suscripcion {
    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Plan: " + this.nombrePlan + ". Precio: " + this.precio);
    }

    public abstract void obtenerBeneficios();

    public abstract void obtenerPeriodoPrueba();

}
