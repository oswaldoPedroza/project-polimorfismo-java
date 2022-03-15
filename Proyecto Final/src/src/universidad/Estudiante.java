package universidad;

public class Estudiante {
    private String nombreEstudiante;
    private Integer edad;
    private Carrera carrera;

    public Estudiante(String nombreEstudiante, Integer edad, Carrera carrera) {
        this.nombreEstudiante = nombreEstudiante;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombreEstudiante='" + nombreEstudiante + '\'' +
                ", edad=" + edad +
                ", carrera=" + carrera +
                '}';
    }
}
