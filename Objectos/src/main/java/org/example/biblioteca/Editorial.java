package org.example.biblioteca;

public class Editorial {
    private String nombre;
    private String pais;

    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial; Nombre: " + getNombre() + ". Pais: " + getPais();
    }

    public static void main(String[] args) {
        Editorial editorial1 = new Editorial("NoviaPol", "Freelance");
    }

}
