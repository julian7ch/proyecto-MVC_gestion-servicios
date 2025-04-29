package org.example.tipoPago.controlador;

import org.example.tipoPago.modelo.TipoPago;

import java.util.ArrayList;
import java.util.List;

public class TipoPagoControlador {
    private final List<TipoPago> listaTiposPago = new ArrayList<>();

    public List<TipoPago> getListaTiposPago() {
        return listaTiposPago;
    }

    public String tipoPagoPorId(Long id){
        for (TipoPago tipo : listaTiposPago){
            if (id.equals(tipo.getIdTipoPago())){
                return tipo.getTipodePago();
            }
        }
        return "el tipo de pago no existe";
    }

    public String crearTipoPago(TipoPago tipoPago){
        listaTiposPago.add(tipoPago);
        return "Se creo el medio de pago correctamente: " + tipoPago;
    }

    public boolean removerMedioPago (Long id){
        return listaTiposPago.removeIf(tipo ->id.equals(tipo.getIdTipoPago()));
    }
}
