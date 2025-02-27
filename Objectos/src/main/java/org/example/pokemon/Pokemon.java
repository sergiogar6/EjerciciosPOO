package org.example.pokemon;

abstract class Pokemon {
    private int nivel;
    private int ps;

    public Pokemon(int nivel, int ps) {
        this.nivel = nivel;
        this.ps = ps;
    }

    public void imprimirDatos() {
        System.out.println("Nivel: " + this.nivel + ". Vida: " + this.ps);
    }

    public abstract void atacar();
}
