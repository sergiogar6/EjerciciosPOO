package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private static int cantidadLibros;
    private static int librosDisponibles;

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

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        cantidadLibros++;
        id = String.format("LIB%03d", cantidadLibros);
        disponible = true;
        librosDisponibles++;
    }

    public void calcularId() {

    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            librosDisponibles--;
            System.out.println("El libro " + titulo + " ha sido prestado con exito.");
        } else {
            System.out.println("El libro " + titulo + " no esta disponible para prestar.");
        }

    }

    public void devolver() {
        if (disponible) {
            System.out.println("El libro " + titulo + " no se puede devolver");
        } else {
            disponible = true;
            librosDisponibles++;
            System.out.println("El libro " + titulo + " ha sido devuelto con exito.");
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ". Autor: " + autor + ". ID: " + id + ". Disponible: " + disponible;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("hola", "soy");
        Libro libro2 = new Libro("adios", "no soy");
        Libro libro3 = new Libro("hola", "soy");
        Libro libro4 = new Libro("adios", "no soy");
        Libro libro5 = new Libro("hola", "soy");
        Libro libro6 = new Libro("adios", "no soy");
        Libro libro7 = new Libro("hola", "soy");
        Libro libro8 = new Libro("adios", "no soy");
        Libro libro9 = new Libro("hola", "soy");
        Libro libro10 = new Libro("adios", "no soy");

        System.out.println(libro1.getId());
        System.out.println(libro2.getId());
        System.out.println(libro10.getId());

        libro1.prestar();
        System.out.println(libro1.disponible);
        libro1.devolver();
    }
}
