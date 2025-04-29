package org.example.complejidad.servicio;

import org.example.complejidad.modelo.Complejidad;
import org.example.tarea.modelo.Tarea;

import java.util.List;

public interface ComplejidadServicio {
    public double definirComplejidad(Tarea tarea);
    public Complejidad obtenerEstadoComplejidadporId(Long id);
    public List<Complejidad> obtenerTodosLosEstado();
    public String agregarComplejidad(Complejidad complejidad);
    public String removerComplejidadPorId(Long id);
}
