package org.example;

public class Estudiante {
    public final static String EMAIL_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.nia = ++contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        nia = ++contadorEstudiantes;
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

    @Override
    public String toString() {
        return nombre + ", " + curso + ", " + nia + ", " + email;
    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String email) {
        return email.matches(EMAIL_FORMAT);
    }
}
