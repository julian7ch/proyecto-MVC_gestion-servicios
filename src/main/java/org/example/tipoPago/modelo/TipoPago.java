package org.example.tipoPago.modelo;

public class TipoPago {

    private long idTipoPago;
    private String tipodePago;
    private String estadoPago;

    public TipoPago(long idTipoPago, String tipodePago, String estadoPago) {
        this.idTipoPago = idTipoPago;
        this.tipodePago = tipodePago;
        this.estadoPago = estadoPago;
    }

    public long getIdTipoPago() {
        return idTipoPago;
    }

    public String getTipodePago() {
        return tipodePago;
    }

    public void setTipodePago(String tipodePago) {
        this.tipodePago = tipodePago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return "TipoPago{" +
                "idTipoPago=" + idTipoPago +
                ", tipodePago='" + tipodePago + '\'' +
                ", estadoPago='" + estadoPago + '\'' +
                '}';
    }
}
