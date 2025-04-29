package org.example.servicio.dao;

import org.example.servicio.modelo.Servicio;

import java.util.List;

public interface ServicioDAO {
    Servicio guardar(Servicio servicio);
    Servicio obtenerPorId(Long id);
    List<Servicio> obtenerTodos();
    boolean eliminar(Long id);
}
