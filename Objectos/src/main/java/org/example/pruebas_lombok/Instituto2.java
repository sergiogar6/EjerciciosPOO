package org.example.pruebas_lombok;

import lombok.*;

@AllArgsConstructor
@Data
public class Instituto2 {
    @NonNull
    private String nombre;
    private final String poblacion;
    private String direccion;

//    public Instituto(String nombre) {
//        this.nombre = Objects.requireNonNull(nombre);
//    }
}
