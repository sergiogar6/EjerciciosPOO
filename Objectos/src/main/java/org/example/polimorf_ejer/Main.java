package org.example.polimorf_ejer;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Desarrollador(),
                new Diseñador(),
                new Gerente()
        };

        for (Empleado empleado : empleados) {
            empleado.realizarTarea();
        }

        Empleado gerente = new Gerente();
        Empleado desarrollador = new Desarrollador();

        System.out.println();

        asignarTarea(gerente);
        System.out.println();
        asignarTarea(desarrollador);
    }

    public static void asignarTarea(Empleado empleado) {
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
