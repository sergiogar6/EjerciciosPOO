package org.example.ud5practica3;

import lombok.*;

// Getter, setters y ToString hechos con lombok
// 2 Constructures: Uno con todos los atributos y otro solo con el nombre ya que esta en @nonnull.
@Getter @Setter @AllArgsConstructor @RequiredArgsConstructor @ToString
public class Estudiante {
    // Nombre del estudiante es obligatorio ya que es not null
    @NonNull
    private String nombre;
    private int edad;
    // Curso en el que esta el estudiante que referencia a la clase curso
    private Curso curso;

}
