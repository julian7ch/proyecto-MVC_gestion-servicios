package org.example.complejidad.dao;

import org.example.complejidad.modelo.Complejidad;

import java.util.List;

public interface ComplejidadDAO {
    Complejidad obtener(Long id);
    List<Complejidad> listar();
    void guardar(Complejidad complejidad);
    void eliminar(Long id);
}
