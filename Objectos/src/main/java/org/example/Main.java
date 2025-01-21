package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", "Viyuela", "54875993X", 150, 60, "Albacete", "Vividor");
        Persona persona2 = new Persona();
        persona1.imprimirInfoPersona();
        persona2.imprimirInfoPersona();
        System.out.println(persona1.concatenar());

        System.out.println("Antes: " + persona1.getNombre());
        persona1.setNombre("Raul");
        System.out.println("Después: " + persona1.getNombre());
        persona1.setNombre("Messi");
        System.out.println("Madrit: " + persona1.getNombre());
    }
}