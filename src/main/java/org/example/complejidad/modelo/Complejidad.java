package org.example.complejidad.modelo;

public class Complejidad {

    private Long idComplejidad;
    private String nombreComplejidad;
    private double factorComplejidad; //<-- se calcula¡¡

    public Complejidad(Long idComplejidad, String nombreComplejidad, double factorComplejidad) {
        this.idComplejidad = idComplejidad;
        this.nombreComplejidad = nombreComplejidad;
        this.factorComplejidad = factorComplejidad;
    }

    public Long getIdComplejidad() {
        return idComplejidad;
    }

    public void setIdComplejidad(Long idComplejidad) {
        this.idComplejidad = idComplejidad;
    }

    public String getNombreComplejidad() {
        return nombreComplejidad;
    }

    public void setNombreComplejidad(String nombreComplejidad) {
        this.nombreComplejidad = nombreComplejidad;
    }

    public double getFactorComplejidad() {
        return factorComplejidad;
    }

    public void setFactorComplejidad(double factorComplejidad) {
        this.factorComplejidad = factorComplejidad;
    }

    @Override
    public String toString() {
        return "Complejidad{" +
                "idComplejidad=" + idComplejidad +
                ", nombreComplejidad='" + nombreComplejidad + '\'' +
                ", factorComplejidad=" + factorComplejidad +
                '}';
    }
}
