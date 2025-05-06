package org.example.tarea.controlador;

import org.example.tarea.modelo.Tarea;
import org.example.tarea.servicio.TareaServicio;

import java.util.List;

public class TareaControlador {
    private final TareaServicio tareaServicio;

    public TareaControlador(TareaServicio tareaServicio) {
        this.tareaServicio = tareaServicio;
    }

    public Tarea crearTarea(Tarea tarea) {
        return tareaServicio.crearServicio(tarea);
    }

    public Tarea obtenerTareaPorId(Long id) {
        return tareaServicio.obtenerPorId(id);
    }

    public List<Tarea> obtenerListaTareas() {
        return tareaServicio.obtenerTodos();
    }

    public boolean borrarTareaPorId(Long id) {
        return tareaServicio.eliminar(id);
    }
}

