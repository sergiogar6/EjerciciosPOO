package org.example.ud5practica3;

import lombok.*;
import java.util.ArrayList;
import java.util.Objects;

//Getters y setters generados con lombok (nombre no tiene setter porque no queremos que se pueda modificar el nombre)7
//Constructor con todos los parametros y ToString generados con lombok
@Getter @AllArgsConstructor @ToString
public class Instituto {
    // Nombre del Instituto es obligatorio ya que es not null
    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    //Lista de objetos Estudiante
    @Setter
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    //Lista de objetos Curso
    @Setter
    private ArrayList<Curso> listaCursos = new ArrayList<>();


    /**
     * Constructor con nombre del instituto
     * Si se pasa un nombre nulo, se le pone "Instituto sin nombre" por defecto
     * @param nombre Nombre del instituto
     */
    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

    /**
     * Metodo para agregar un estudiante a la lista de estudiantes
     * Si el estudiante creado no es nulo se añade a la lista, si no indica un mensaje de error.
     * @param estudiante Objeto Estudiante a agregar a la lista
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            listaEstudiantes.add(estudiante);
        } else {
            System.out.println("No se puede agregar un estudiante NULO a la lista de estudiantes");
        }
    }

    /**
     * Metodo para agregar un curso a la lista de los cursos.
     * Primero se verifica que el curso no sea nulo y si no lo es despues se verifica
     * que en la lista de cursos no haya un curso con el mismo nombre y las mismas horas.
     * @param curso Objeto Curso a agregar a la lista
     */
    public void agregarCurso(Curso curso) {
        if (curso != null) {
            for (Curso cursoLista : listaCursos){
                if (cursoLista.getNombre().equalsIgnoreCase(curso.getNombre()) && cursoLista.getHoras() == curso.getHoras()) {
                    System.out.println("No se puede agregar un curso REPETDO a la lista de cursos");
                    return;
                }
            }
            listaCursos.add(curso);
        } else {
            System.out.println("No se puede agregar un curso NULO a la lista de cursos");
        }

    }
}
