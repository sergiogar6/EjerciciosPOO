package org.example.ud5practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private Empleado director;
    //Listas de relacion a los empleados e invitados
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;

    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        //Al crear el programa creamos el director y lo añadimos a la lista de empleados
        this.director = new Empleado(nombreDirector, "director");
        this.listaEmpleados.add(director);
        cadena.agregarPrograma(this);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }


    //Metodo para añadir un DIRECTOR al programa.
    public void agregarDirector(String nombre, String cargo) {
        Empleado empleado = new Empleado(nombre, cargo);
        listaEmpleados.add(empleado);
    }

    //Metodo para añadir un EMPLEADO al programa
    public void agregarEmpleado(String nombre, String cargo, Empleado director) {
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }

    //Metodo para mostrar empleados del programa
    public void mostrarEmpleado() {
        System.out.println("El programa " + nombre + " tiene los siguientes empleados: " + listaEmpleados.size());
        for (Empleado empleado : listaEmpleados) {
            System.out.println("- " + empleado.getNombre() + ", " + empleado.getCargo() + ", " + empleado.getDirector());
        }
    }

    //Metodo para añadir un invitado al programa.
    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);

    }

    //Metodo para mostrar invitados del programa
    public void mostrarInvitado() {
        System.out.println("El programa " + nombre + " tiene los siguientes invitados: " + listaInvitados.size());

        for (Invitado invitado : listaInvitados) {
            System.out.println("- " + invitado.getNombre() + ", " + invitado.getProfesion() + ", " + invitado.getTemporada() + ", " + invitado.getFecha_visita());
        }
    }
    //Recorre la lista de invitados y cuenta cada temporada si coincide con la temporada pasada como parametro
    public int invitadosTemporada(int temporada) {
        int totalInvitados = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                totalInvitados++;
            }
        }
        return totalInvitados;
    }

    //Cuenta las veces que ha estado el invitado en el programa recorriendo la lista de invitados y buscado el nombre (parametro) en ella
    public int vecesInvitado(String nombre) {
        int vecesInvitado = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                vecesInvitado++;
            }
        }
        return vecesInvitado;
    }

    //Recorre cada invitado de la lista de invitados y por cada invitado que coincida con el nombre muestra la temporada y le fecha en la que visito el programa
    public void rastrearInvitado(String nombre) {
        System.out.println(nombre + " ha ido " + this.vecesInvitado(nombre) + " veces al programa");
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Temporada: " + invitado.getTemporada() + ". Fecha: " + invitado.getFecha_visita());
            }
        }
    }

    //Devuelve si true si el parametro nombre esta en la lista de invitados y false si no lo esta
    public boolean buscarInvitado(String nombre) {
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
               return true;
            }
        }
        return false;
    }

    //Compara las fechas que el invitado ha asistido a cada programa y indica a cual a ido antes, si no ha ido o si han estado en el programa el mismo dia
    //Para sacar la fecha mas antigua de cada programa se utiliza el metodo primerPrograma
    public void invitadoAntes(String nombre, Programa programa1, Programa programa2) {
        LocalDate fechaPrograma1 = programa1.primerPrograma(nombre);
        LocalDate fechaPrograma2 = programa2.primerPrograma(nombre);

        if(fechaPrograma1 == null && fechaPrograma2 == null) {
            System.out.println("El invitado " + nombre + " no ha estado en ninguno de los programas.");
        } else if(fechaPrograma1 == null) {
            System.out.println("El invitado " + nombre + " ha estado solo en " + programa2.getNombre());
        } else if(fechaPrograma2 == null) {
            System.out.println("El invitado " + nombre + " ha estado solo en " + programa1.getNombre());
        } else {
            if(fechaPrograma1.isBefore(fechaPrograma2)) {
                System.out.println("El invitado " + nombre + " ha estado primero en " + programa1.getNombre());
            } else if(fechaPrograma2.isBefore(fechaPrograma1)) {
                System.out.println("El invitado " + nombre + " ha estado primero en " + programa2.getNombre());
            } else {
                System.out.println("El invitado " + nombre + " ha estado en ambos programas el mismo día.");
            }
        }

    }

    //Metodo intermedio para obtener la fecha del primer programa al que acudio el invitado.
    //En caso de no haber acudido devuelve null (usando el metodo buscarInvitado() para ver si a ido o no al programa)
    public LocalDate primerPrograma(String nombre) {
        if (buscarInvitado(nombre)) {
            LocalDate primerProgramaFecha = LocalDate.now();
            for (Invitado invitado : listaInvitados) {
                if (invitado.getNombre().equalsIgnoreCase(nombre) && invitado.getFecha_visita().isBefore(primerProgramaFecha)) {
                    primerProgramaFecha = invitado.getFecha_visita();
                }
            }
            return primerProgramaFecha;
        } else {
            return null;
        }

    }
    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", director=" + director +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                '}';
    }
}
