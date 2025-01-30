package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {
    public final static String EMAIL_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.nia = ++contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        nia = ++contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void anadirLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    @Override
    public String toString() {
        if (librosPrestados.isEmpty()) {
            return nombre + ", " + curso + ", " + nia + ", " + email;
        } else {
            return nombre + ", " + curso + ", " + nia + ", " + email + ". Libro prestado: " + librosPrestados;
        }

    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String email) {
        return email.matches(EMAIL_FORMAT);
    }
}
