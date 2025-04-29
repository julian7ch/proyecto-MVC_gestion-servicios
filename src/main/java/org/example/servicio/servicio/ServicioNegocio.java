package org.example.servicio.servicio;

import org.example.servicio.modelo.Servicio;
import org.example.usuario.modelo.Usuario;

import java.util.Date;
import java.util.List;

public interface ServicioNegocio {
    Servicio guardar(Servicio servicio);
    Servicio obtenerPorId(Long id);
    List<Servicio> obtenerTodos();
    boolean eliminar(Long id);

    public String asignarSolicitante(Usuario usuario);
    public String marcarCompletado(Date date);
    public double obtenerCosto();
    public Servicio resumenServicio(Servicio servicio); //que debe retornar?
}
