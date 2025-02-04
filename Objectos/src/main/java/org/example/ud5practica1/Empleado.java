package org.example.ud5practica1;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    private static int countEmpleado = 0;

    public Empleado(String nombre, Empleado director) {
        countEmpleado++;
        this.id = String.format("EP%03d", countEmpleado);
        this.nombre = nombre;
        this.cargo = "pte";
        this.director = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                ", countEmpleado=" + countEmpleado +
                '}';
    }

    public void asignarDirector(Empleado director) {
        this.director = director;
    }

}
