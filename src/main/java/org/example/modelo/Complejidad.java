package org.example.modelo;

public class Complejidad {

    private long idComplejidad;
    private String nombreComplejidad;
    private double factorComplejidad; //<-- se calcula¡¡

    public Complejidad(long idComplejidad, String nombreComplejidad, double factorComplejidad) {
        this.idComplejidad = idComplejidad;
        this.nombreComplejidad = nombreComplejidad;
        this.factorComplejidad = factorComplejidad;
    }

    public long getIdComplejidad() {
        return idComplejidad;
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
