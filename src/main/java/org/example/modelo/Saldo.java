package org.example.modelo;

public class Saldo {

    private long idSaldo;
    private double cartera;
    private String tipo;

    public Saldo(long idSaldo, double cartera, String tipo) {
        this.idSaldo = idSaldo;
        this.cartera = cartera;
        this.tipo = tipo;
    }

    public long getIdSaldo() {
        return idSaldo;
    }


    public double getCartera() {
        return cartera;
    }

    public void setCartera(double cartera) {
        this.cartera = cartera;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Saldo{" +
                "idSaldo=" + idSaldo +
                ", cartera=" + cartera +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
