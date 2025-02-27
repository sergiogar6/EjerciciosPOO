package org.example.redes_sociales;

import org.example.herencia_ej.Persona;

public class RedSocial {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Juanito", 22, "Juan777HD", 63);
        Influencer influencer1 = new Influencer("Nacho Lafon", 21, "Asuso14", 100);
        influencer1.añadirColaboradores("Jose Mota", "Pepe Viyuela", "El rubius OMG");
        Streamer streamer1 = new Streamer("Paco Hernandez", 321, "PaquitoElGamer", 67849, 99, 1099);
        Basico basico1 = new Basico("Pedro Pico", 33, "Pepi123", 9);

        System.out.println("Información del Usuario");
        user1.mostrarInformacion();

        System.out.println();

        System.out.println("Información del Influencer");
        influencer1.mostrarInformacion();

        System.out.println();

        System.out.println("Información del streamer");
        streamer1.mostrarInformacion();

        System.out.println();

        System.out.println("Información de la persona normal");
        basico1.mostrarInformacion();

        Usuario influencer2 = new Influencer("Laura", 33, "Laurigamer", 333414);
    }
}
