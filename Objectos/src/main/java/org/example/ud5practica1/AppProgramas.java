package org.example.ud5practica1;

public class AppProgramas {
    public static void main(String[] args) {
        Cadena cadena1 = new Cadena("Antena 3");

        Programa programa1 = new Programa("El formiguero", cadena1, "director1");

        Programa programa2 = new Programa("La residencia", cadena1, "director2");


        programa1.agregarEmpleado("Paco", "Fiestas", programa1.getDirector());

        System.out.println(programa1);
        programa1.agregarInvitado("Pepe","Nini", 1);
        programa2.agregarInvitado("Pepe","Nini", 3);

        programa1.mostrarInvitado();

        //Metodos extras a implementar
        System.out.println(programa1.invitadosTemporada(1));
        System.out.println(programa1.vecesInvitado("pepe"));
        programa1.rastrearInvitado("pepe");
        System.out.println(programa1.buscarInvitado("pepe"));
        System.out.println(programa1.buscarInvitado("paquito"));
        programa1.invitadoAntes("pepe", programa1, programa2);

        System.out.println(cadena1);

        System.out.println(programa1);
        System.out.println(programa2);

    }
}
