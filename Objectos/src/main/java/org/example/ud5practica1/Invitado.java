package org.example.ud5practica1;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {
    Scanner entry = new Scanner(System.in);
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita = LocalDate.now();
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        setFecha_visita();
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    //Guarda variable de año, mes y dia y con LocalDate.of() lo define el fecha_visita
    public void setFecha_visita() {
        System.out.println("Introduce el año en el que acudira el invitado " + this.nombre + ":");
        int anyo = entry.nextInt();
        System.out.println("Introduce el mes:");
        int mes = entry.nextInt();
        System.out.println("Introduce el dia:");
        int dia = entry.nextInt();
        this.fecha_visita = LocalDate.of(anyo, mes, dia);
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }

}
