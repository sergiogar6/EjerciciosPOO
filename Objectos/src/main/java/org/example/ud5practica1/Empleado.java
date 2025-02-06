package org.example.ud5practica1;

public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    private static int countEmpleado = 0;

    //Constructor para empleados que si se le pasar el director del programa como parametro
    public Empleado(String nombre, String cargo, Empleado director) {
        countEmpleado++;
        this.id = String.format("EP%03d", countEmpleado);
        this.nombre = nombre;
        setCargo(cargo);
        this.director = director;
    }

    //Constructor para DIRECTORES que pondra el atributo director en null ya que el es el director
    public Empleado(String nombre, String cargo) {
        countEmpleado++;
        this.id = String.format("EP%03d", countEmpleado);
        this.nombre = nombre;
        setCargo(cargo);
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

    //set del cargo con comprobacion de que sea un cargo valido, en caso de no serlo se pone el valor por defecto "pte"
    public void setCargo(String cargo) {
        if (cargo.equalsIgnoreCase("director") || cargo.equalsIgnoreCase("tecnico") || cargo.equalsIgnoreCase("presentador") || cargo.equalsIgnoreCase("colaborador")) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }

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
                ", Id empleado=" + countEmpleado +
                '}';
    }


}
