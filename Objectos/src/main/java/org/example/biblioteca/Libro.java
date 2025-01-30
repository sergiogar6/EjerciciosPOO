package org.example.biblioteca;

import org.example.equipos.Editorial;

public class Libro {
    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private static int cantidadLibros;
    private static int librosDisponibles;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        cantidadLibros++;
        id = String.format("LIB%03d", cantidadLibros);
        disponible = true;
        librosDisponibles++;
        estudiantePrestado=null;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    public static void setCantidadLibros(int cantidadLibros) {
        Libro.cantidadLibros = cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public static void setLibrosDisponibles(int librosDisponibles) {
        Libro.librosDisponibles = librosDisponibles;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public Prestamo prestar(Estudiante estudiante) {
        if (disponible && estudiante.getLibrosPrestados().contains(this)) {
            disponible = false;
            librosDisponibles--;
            System.out.println("El libro " + titulo + " ha sido prestado con exito a " + estudiante.getNombre());
            estudiantePrestado = estudiante;
            estudiante.anadirLibro(this);
            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Se ha generado el prestamo " + prestamo);
            return prestamo;
        } else if (estudiante.getLibrosPrestados().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado");
        } else {
            System.out.println("El libro " + titulo + " no esta disponible para prestar.");
        }
        return null;
    }

    public void devolver(Estudiante estudiante) {
        if (disponible) {
            System.out.println("El libro " + titulo + " no se puede devolver");
        } else {
            disponible = true;
            librosDisponibles++;
            System.out.println("El libro " + titulo + " ha sido devuelto con exito.");
            estudiantePrestado = null;
            estudiante.setLibrosPrestados(null);
        }
    }

    @Override
    public String toString() {
        if (estudiantePrestado != null) {
            return "Titulo: " + titulo + ". Autor: " + autor + ". ID: " + id + ". Disponible: " + disponible + ". Estudiante prestado: " + estudiantePrestado.getNombre();
        } else {
            return "Titulo: " + titulo + ". Autor: " + autor + ". ID: " + id + ". Disponible: " + disponible;
        }
    }

}
