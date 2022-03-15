package ejecutando;

import universidad.Carrera;
import universidad.Estudiante;

import java.util.LinkedList;
import java.util.List;

public class EjecutandoSistema {
    public static void main(String[] args) {
        Carrera programacion = new Carrera(01, "programacion");
        List<String> asignaturasProgramacion = new LinkedList<>();
        asignaturasProgramacion.add("Patrones de diseño");
        asignaturasProgramacion.add("Programacion Java");
        asignaturasProgramacion.add("Programacion Python");

        programacion.setAsignaturas(asignaturasProgramacion);

        Carrera matematicas = new Carrera(02,"matematicas");
        List<String> asignaturasMatematicas = new LinkedList<>();
        asignaturasMatematicas.add("Calculo 1");
        asignaturasMatematicas.add("Calculo 2");
        asignaturasMatematicas.add("Ecuaciones Lineales");

        matematicas.setAsignaturas(asignaturasMatematicas);

        Estudiante carlos = new Estudiante("Carlos", 25, programacion);
        Estudiante andres = new Estudiante("andres", 28,matematicas);

        imprimir(carlos);
        imprimir(andres);

    }
    public static void imprimir(Estudiante estudiante){
        System.out.println("Nombre del estudiante: " + estudiante.getNombreEstudiante());
        System.out.println("Edad del estudiante: " + estudiante.getEdad());
        System.out.println("Carrera del estudiante: " + estudiante.getCarrera());

    }
}
