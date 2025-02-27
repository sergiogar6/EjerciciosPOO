package org.example.pokemon;

public class AppPokedex {
    public static void main(String[] args) {
        Electrico pikachu = new Electrico(100, 100);
        Pokemon raichu = new Electrico(100, 200);
        pikachu.atacar();
        raichu.atacar();

        Agua squirtle = new Agua(200, 100);
        squirtle.atacar();
        squirtle.imprimirDatos();
        squirtle.pistoAgua();



        Pokemon jiglipuff = new Pokemon(25,30) {
            @Override
            public void atacar() {
                System.out.println("CANTO");
            }
        };

        jiglipuff.atacar();
        jiglipuff.imprimirDatos();
    }
}
