package org.example.saldo.controlador;

import org.example.saldo.modelo.Saldo;
import org.example.usuario.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class SaldoControlador {
    private final List<Saldo> listaSaldo = new ArrayList<>();

    public double obtenerSaldoporId(Long id){
        return  listaSaldo.stream().
                filter(saldo -> saldo.equals(id)).map(Saldo::getCartera)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cartera no existe con id: " + id));
    }

    public List<Saldo> obtenerTodoslosSaldos(){
        return listaSaldo;
    }

    public String crearCartera(Saldo saldo){
        listaSaldo.add(saldo);
        return "Se ha creado la nueva cartera";
    }

    public void borrarCartera(Long id){
        listaSaldo.removeIf(saldo -> id.equals(saldo.getIdSaldo()));
        System.out.println("el usuario ha sido removido exitosamente con id: " + id);
    }
}
