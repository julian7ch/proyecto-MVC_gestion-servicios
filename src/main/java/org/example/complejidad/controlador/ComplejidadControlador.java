package org.example.complejidad.controlador;

import org.example.complejidad.modelo.Complejidad;
import org.example.complejidad.servicio.ComplejidadServicio;
import org.example.complejidad.servicio.ComplejidadServicioImpl;
import org.example.tarea.modelo.Tarea;

import java.util.List;

public class ComplejidadControlador {

    private final ComplejidadServicio complejidadServicio = new ComplejidadServicioImpl();

    public double calcularComplejidadTarea(Tarea tarea) {
        return complejidadServicio.definirComplejidad(tarea);
    }

    public Complejidad obtenerPorId(Long id) {
        return complejidadServicio.obtenerEstadoComplejidadporId(id);
    }

    public List<Complejidad> listar() {
        return complejidadServicio.obtenerTodosLosEstado();
    }

    public String guardar(Complejidad complejidad) {
        return complejidadServicio.agregarComplejidad(complejidad);
    }

    public String eliminar(Long id) {
        return complejidadServicio.removerComplejidadPorId(id);
    }
}
