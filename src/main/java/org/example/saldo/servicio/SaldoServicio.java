package org.example.saldo.servicio;

import org.example.costo.modelo.Costo;
import org.example.tipoPago.modelo.TipoPago;

public interface SaldoServicio {
    public double actualizarSaldo(Costo costo, TipoPago tipoPago);
}
