package org.example.clases_avanzadas;

public class AppVehiculos {
    public static void main(String[] args) {
        Avion airbus = new Avion("Airbus", "1234DKF", 2);
        Tren ave = new Tren("Renfe", "4321FKD", 8);

        airbus.imprimirInfo();
        ave.imprimirInfo();

        airbus.ruido();
        ave.ruido();
    }


}
