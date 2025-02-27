package org.example.redes_sociales;

public class Usuario {
    private String nombre;
    private int edad;
    private String nombreUsuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombreUsuario, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
        this.seguidores = seguidores;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Nombre de Usuario: " + this.nombreUsuario);
        System.out.println("Numero de seguidores: " + this.seguidores);
    }
}
