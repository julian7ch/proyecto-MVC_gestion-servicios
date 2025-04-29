package org.example.tarea.dao;

import org.example.tarea.modelo.Tarea;

import java.util.List;

public interface TareaDAO {

    Tarea guardar(Tarea tarea);

    Tarea buscarPorId(long idTarea);
    List<Tarea> consultarTodasLasTareas();

    Tarea actualizar(Tarea tarea);

    boolean eliminar(long idTarea);

    boolean habilitarTarea(long idTarea);
}

