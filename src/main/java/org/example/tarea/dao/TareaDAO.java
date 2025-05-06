package org.example.tarea.dao;

import org.example.tarea.modelo.Tarea;

import java.util.List;

public interface TareaDAO {
    Tarea guardar(Tarea tarea);
    Tarea obtenerPorId(Long id);
    List<Tarea> obtenerTodos();
    boolean eliminar(Long id);
}
