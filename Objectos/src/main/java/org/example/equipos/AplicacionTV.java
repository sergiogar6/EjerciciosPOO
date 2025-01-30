package org.example;

public class AplicacionTV {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();
        Televisor televisor2 = new Televisor();

        televisor1.setVolumen(televisor1.bajarVolumen());
        System.out.println("Volumen: " + televisor1.getVolumen());
        televisor1.setVolumen(televisor1.subirCanal());
        System.out.println("Canal: " + televisor1.getCanal());

        System.out.println(televisor2);

    }
}
