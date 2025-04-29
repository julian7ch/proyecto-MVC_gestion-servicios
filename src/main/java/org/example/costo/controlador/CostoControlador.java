package org.example.costo.controlador;

import org.example.costo.modelo.Costo;

import java.util.ArrayList;
import java.util.List;

public class CostoControlador {
    private final List<Costo> costoLista = new ArrayList<>();

    public double obtenerCostoPorId(Long id) {
        return costoLista.stream()
                .filter(costo -> id.equals(costo.getIdCosto()))
                .map(Costo::getCosto)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Producto no existe con id: " + id));
    }

    public void agregarCosto(Costo costo) {
        costoLista.add(costo);
    }

    public List<Costo> obtenerCostos(){
        return costoLista;

    }
}
