package org.example.casa;

public class AppCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");
        casa.agregarHabitacion("Dormitorio", 20);
        casa.agregarHabitacion("Cocina",15);
        casa.agregarHabitacion("Baño",10);

        casa.mostrarHabitaciones();


        System.out.println(casa.getHabitacionMasGrande());
        System.out.println(casa.getPropietario());

    }
}
