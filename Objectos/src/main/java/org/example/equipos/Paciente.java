package org.example;

import java.security.PublicKey;
import java.util.Random;

public class Paciente {
    private final static char Genero_def = 'X';
    public final static int Sobrepeso = 1;
    public final static int Peso_bajo = -1;
    public final static int Peso_ideal = 0;
    private final static int Mayor_edad = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Paciente: " + this.nombre + " con " + this.edad + " años de edad. Genero " + this.sexo + " y dni: " + this.dni + ". Con altura " + this.altura + " y peso " + this.peso + " kg.";
    }

    public Paciente(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        generarDni();
    }

    public Paciente() {
        this("", 0, Genero_def, 0, 0);
    }

    public Paciente(String nombre, int edad, char genero) {
        this(nombre, edad, genero, 0, 0);
    }

    private void generarDni() {
        Random random = new Random();
        int numero = random.nextInt(99999999) + 10000000;

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = numero%23;
        this.dni = Integer.toString(numero) + letras[resto];
    }

    public int calcularIMC() {
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            return Peso_bajo;
        } else if (imc > 25) {
            return Sobrepeso;
        } else {
            return Peso_ideal;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= Mayor_edad) {
            return true;
        } else {
            return false;
        }
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'M' && sexo != 'H') {
            this.sexo = Genero_def;
        } else {
            this.sexo = sexo;
        }
    }

    public void mostrarInfoPaciente() {
        System.out.println("Paciente: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("DNI: " + this.dni);
        System.out.println("Genero: " + this.sexo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }

}
