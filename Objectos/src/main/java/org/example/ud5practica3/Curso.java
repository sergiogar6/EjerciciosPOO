package org.example.ud5practica3;

import lombok.*;

//Getters, setters y ToString generados con lombok
// Constructor con todos los atributos
@Getter @Setter @AllArgsConstructor @ToString
public class Curso {
    // Nombre del curso es obligatorio ya que es not null
    @NonNull
    private String nombre;
    private int horas;
}
