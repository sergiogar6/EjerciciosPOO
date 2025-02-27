package org.example.plataforma_streaming;

import java.util.ArrayList;

public class PlataformaStreaming {
    public static void main(String[] args) {
        Suscripcion[] planes = {
            new PlanGratis("Gratis", 0.0),
            new PlanBasico("Basico", 9.99),
            new PlanPremium("Premiun", 14.99),
            new PlanFamiliar("Familiar", 19.99)
        };

        for (Suscripcion suscripcion : planes) {
            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
        }

    }
}
