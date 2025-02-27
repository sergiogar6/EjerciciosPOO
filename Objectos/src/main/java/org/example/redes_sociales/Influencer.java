package org.example.redes_sociales;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public void añadirColaboradores(String... colaboradores) {
        colaboraciones.addAll(Arrays.asList(colaboradores));
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
