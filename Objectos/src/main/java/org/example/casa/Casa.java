package org.example.casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    Scanner entry = new Scanner(System.in);
    private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Inserte propietario:");
        String nombre = entry.next();
        System.out.println("Edad del propietario:");
        int edad = entry.nextInt();
        propietario = new Propietario(nombre, edad);
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void agregarHabitacion(String nombre, double metros) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                System.out.println("La habitacion ya existe");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene las siguientes habitaciones: " + habitaciones.size());

        for (Habitacion habitacion : habitaciones) {
            System.out.println("- " + habitacion.getNombre() + "(" + habitacion.getMetrosCuadrados() + " m²)");
        }
    }

    public  Habitacion getHabitacionMasGrande() {
        Habitacion mayor = habitaciones.get(0);
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getMetrosCuadrados() > mayor.getMetrosCuadrados()) {
                mayor = habitacion;
            }
        }
        return mayor;
    }

    public void eliminarHabitacion(String nombre) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                habitaciones.remove(habitacion);
                return;
            }
        }
    }

    public Habitacion getHabitacionMasConsumo() {
        Habitacion mayorConsumo = habitaciones.getFirst();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.calcularConsumo() > mayorConsumo.calcularConsumo()) {
                mayorConsumo = habitacion;
            }
        }
        return mayorConsumo;
    }

    public int getHabitacionPosicion() {
        System.out.println("Introduce la habitacion a la que quieres agregar electrodomesticos:");
        String nombre = entry.next();
        int pos=0;
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
}
