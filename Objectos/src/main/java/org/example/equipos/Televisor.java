package org.example;

public class Televisor {

    private int canal = 1;
    private int volumen = 5;

    public Televisor() {

    }

    public Televisor(int canal, int volumen) {
        this.canal = canal;
    }

    public int subirCanal() {
        if (this.canal >= 1 && this.canal < 99) {
            this.canal++;
        }
        return this.canal;
    }

    public int bajarCanal() {
        if (this.canal > 1 && this.canal <= 99) {
            this.canal--;
        }
        return this.canal;
    }

    public int subirVolumen() {
        if (this.volumen >= 0 && this.volumen < 99) {
            this.volumen++;
        }
        return this.volumen;
    }

    public int bajarVolumen() {
        if (this.volumen > 0 && this.volumen <= 99) {
            this.volumen--;
        }
        return this.volumen;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return this.canal + ", " + this.volumen;
    }

}
