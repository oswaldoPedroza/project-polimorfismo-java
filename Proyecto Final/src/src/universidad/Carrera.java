package universidad;

import java.util.List;

public class Carrera {
    private Integer codigo;
    private String nombre;
    private List<String> asignaturas;

    public Carrera(Integer codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
