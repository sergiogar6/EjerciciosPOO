package org.example.pokemon;

public class Agua extends Pokemon implements AtaquesAgua {

    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("Pistola Agua");
    }

    @Override
    public void hidroBomba() {
        System.out.println("BOOOOOOM");
    }

    @Override
    public void surf() {
        System.out.println("COJO UNA HOLA");
    }

    @Override
    public void pistoAgua() {
        System.out.println("FLUSH FLUSH");
    }

    @Override
    public void salpicadura() {
        System.out.println("SALPICADURAAAA");
    }
}
