package org.example.modelo;

public class Costo {
    private long idCosto;
    private double costo;

    public Costo(long idCosto, double costo) {
        this.idCosto = idCosto;
        this.costo = costo;
    }

    public long getIdCosto() {
        return idCosto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Costo{" +
                "idCosto=" + idCosto +
                ", costo=" + costo +
                '}';
    }
}
