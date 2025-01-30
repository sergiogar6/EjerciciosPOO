package org.example.equipos;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaCompra {
    public static void main(String[] args) {
        ArrayList<String> listaCompra = new ArrayList<>();
        System.out.println(listaCompra);
        listaCompra.addAll(Arrays.asList("Pan","Pipas","Cebolla","Patatas","Jamón Serrano"));
        System.out.println("Tercer elemento de la lista: " + listaCompra.get(2));
        listaCompra.set(1, "Queso");
        String producto = (listaCompra.indexOf("Leche") > 0) ? "Leche está en la lista" : "No esta en la lista";
        System.out.println(producto);
        System.out.println("Elementos en la lista: " + listaCompra.size());
        Object listaCompra_copia = listaCompra.clone();

    }
}
