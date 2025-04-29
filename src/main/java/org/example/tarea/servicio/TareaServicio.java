package org.example.tarea.servicio;

import org.example.tarea.modelo.Tarea;

import java.util.List;

public interface TareaServicio {

    Tarea guardarTareaCapaServicio(Tarea tarea);

    Tarea buscarTareaPorIdCapaServicio(long idTarea);

    List<Tarea> obtenerTodasLasTareasCapaServicio();

    Tarea actualizarTareaCapaServicio(Tarea tarea);

    boolean eliminarTareaCapaServicio(long idTarea);

    boolean habilitarTareaCapaServicio(long idTarea);
}
