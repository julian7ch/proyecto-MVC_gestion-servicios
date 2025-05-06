package org.example.complejidad.controlador;

import org.example.categoria.modelo.Categoria;
import org.example.complejidad.modelo.Complejidad;
import org.example.complejidad.servicio.ComplejidadServicio;
import org.example.complejidad.servicio.ComplejidadServicioImpl;

import java.util.List;

public class ComplejidadControlador {

    private final ComplejidadServicio complejidadServicio = new ComplejidadServicioImpl();

    public double calcularComplejidadTarea(Categoria categoria) {
        return complejidadServicio.definirComplejidad(categoria);
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
