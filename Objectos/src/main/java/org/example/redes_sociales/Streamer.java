package org.example.redes_sociales;

public class Streamer extends Usuario{
    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreUsuario, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de retransmisiones: " + this.numero_retransmisiones);
        System.out.println("Horas de directo: " + this.horas_directo);
    }
}
