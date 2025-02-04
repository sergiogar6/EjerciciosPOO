package org.example.ud5practica1;

public class AppProgramas {
    public static void main(String[] args) {
        Cadena cadena1 = new Cadena("Antena 3");
        System.out.println(cadena1);

        Programa programa1 = new Programa("El formiguero", cadena1);
        System.out.println(programa1);

        Invitado invitado1 = new Invitado("Raul", "Nini", 1);
        System.out.println(invitado1);

        Invitado invitado2 = new Invitado("Raul", "Nini", 2);
        System.out.println(invitado2);

        System.out.println();

    }
}
