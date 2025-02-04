package org.example;

import org.example.biblioteca.Estudiante;
import org.example.biblioteca.Libro;
import org.example.biblioteca.Prestamo;
import org.example.biblioteca.Editorial;

public class Main {
    public static void main(String[] args) {
//        Persona persona1 = new Persona("Pepe", "Viyuela", "54875993X", 150, 60, "Albacete", "Vividor");
//        Persona persona2 = new Persona();
//        persona1.imprimirInfoPersona();
//        persona2.imprimirInfoPersona();
//        System.out.println(persona1.concatenar());
//
//        System.out.println("Antes: " + persona1.getNombre());
//        persona1.setNombre("Raul");
//        System.out.println("Después: " + persona1.getNombre());
//        persona1.setNombre("Messi");
//        System.out.println("Madrit: " + persona1.getNombre());
//
//        Paciente paciente_fit = new Paciente("Llados", 40, 'M', 130.10F, 1.70F);
//        paciente_fit.mostrarInfoPaciente();

//        Scanner entry = new Scanner(System.in);
//        System.out.println("Introduce un nombre: ");
//        String nombre = entry.next();
//        System.out.println("Introduce la edad: ");
//        int edad = entry.nextInt();
//        System.out.println("Introduce tu sexo: ");
//        char sexo = entry.next().charAt(0);
//        System.out.println("Introduce tu peso: ");
//        float peso = entry.nextFloat();
//        System.out.println("Introduce tu altura: ");
//        float altura = entry.nextFloat();
//
//        Paciente paciente1 = new Paciente();
//        Paciente paciente2 = new Paciente(nombre, edad, sexo);
//        Paciente paciente3 = new Paciente(nombre, edad, sexo, peso, altura);
//
//        paciente1.setNombre("Francisco Sanchez");
//        paciente1.setEdad(55);
//        paciente1.setAltura(1.90F);
//        paciente1.setSexo('G');
//        paciente1.setPeso(900);
//
//        comprobarPeso(paciente1);
//        comprobarPeso(paciente2);
//        comprobarPeso(paciente3);
//
//        comprobadEdad(paciente1);
//        comprobadEdad(paciente2);
//        comprobadEdad(paciente3);
//
//        System.out.println(paciente1);
//    }
//
//    public static void comprobarPeso(Paciente paciente) {
//        int imc = paciente.calcularIMC();
//
//        switch (imc) {
//            case Paciente.Peso_bajo -> System.out.println(paciente.getNombre() + " esta por debajo de su pero ideal");
//            case Paciente.Peso_ideal -> System.out.println(paciente.getNombre() + " esta en su peso ideal");
//            case Paciente.Sobrepeso -> System.out.println(paciente.getNombre() + " esta por encima de su peso ideal");
//        }
//    }
//
//    public static void comprobadEdad(Paciente paciente) {
//        if (paciente.esMayorDeEdad()) {
//            System.out.println(paciente.getNombre() +  " es mayor de edad");
//        } else {
//            System.out.println(paciente.getNombre() + " es menor de edad");
//        }


//        Persona persona1 = new Persona("Paquito", "El chocolatero", "12345678A", 80, 40, "malaga", "chocolatero");
//        Equipo equipo1 = new Equipo("Los mas duros");
//        equipo1.anadirComponente(persona1);
//        System.out.println(equipo1);

        Estudiante estudiante = new Estudiante("Pepito", "1ºC", "abc123@alu.edu.gva.es");
        Editorial editorial = new Editorial("Los chunguitos", "Colombia");
        Libro libro1 = new Libro("Capitan Calzoncillos", "Juseph Pedrerol", editorial);
        Libro libro2 = new Libro("La casa de las carcasas", "Dick Long", editorial);
        System.out.println(libro1);
        System.out.println(libro2);
        Prestamo prestamo = libro1.prestar(estudiante);

        libro1.prestar(estudiante);
        libro1.devolver(estudiante);
    }
  }