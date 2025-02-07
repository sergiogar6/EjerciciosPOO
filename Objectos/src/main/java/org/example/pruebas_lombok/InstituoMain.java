package org.example.pruebas_lombok;

public class InstituoMain {
    public static void main(String[] args) {
        Instituto2 iesAlluser = new Instituto2("IES Alluser", "Mutxamel", "calle falsa 123");
        System.out.println(iesAlluser);

        Instituto2 paquito = null;
        try {
            paquito = new Instituto2(null, "mutxamel", "calle mas falsa 123");
        } catch (NullPointerException e) {
            System.out.println("El nombre no puede ser nulo");
        }
        
        System.out.println(paquito);
    }
}
