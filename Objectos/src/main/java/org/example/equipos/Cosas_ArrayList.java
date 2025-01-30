package org.example.equipos;

import java.util.ArrayList;

public class Cosas_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(3);
        listaNumeros.add(14);
        listaNumeros.add(45);
        listaNumeros.add(1, 9);
        System.out.println(listaNumeros.getFirst());
        listaNumeros.removeFirst();
        System.out.println(listaNumeros.getFirst());
        System.out.println(listaNumeros.size());

    }
}
