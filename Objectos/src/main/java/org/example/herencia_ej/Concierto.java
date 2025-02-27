    package org.example.herencia_ej;

    public class Concierto {
        public static void main(String[] args) {

            Persona a1 = new Asistente("Carlos", 25, "VIP");
            Persona art1 = new Artista("Pepita", 28, "Pop");
            Persona org1 = new Organizador("Jose Mota",59, "Seguridad");

            System.out.println("Información del asistente:");
            a1.mostrarInfo();

            System.out.println();

            System.out.println("Información del artista:");
            art1.mostrarInfo();

            System.out.println();

            System.out.println("Información del organizador:");
            org1.mostrarInfo();

        }

        public void mostrarAcceso(Persona persona) {

        }
    }
