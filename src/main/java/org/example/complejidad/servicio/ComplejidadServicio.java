package org.example.complejidad.servicio;

import org.example.categoria.modelo.Categoria;
import org.example.complejidad.modelo.Complejidad;

import java.util.List;

public interface ComplejidadServicio {
    public double definirComplejidad(Categoria categoria);
    public Complejidad obtenerEstadoComplejidadporId(Long id);
    public List<Complejidad> obtenerTodosLosEstado();
    public String agregarComplejidad(Complejidad complejidad);
    public String removerComplejidadPorId(Long id);
}
