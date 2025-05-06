package org.example.tarea.servicio;

import org.example.tarea.modelo.Tarea;

import java.util.Date;
import java.util.List;

public interface TareaServicio {
    Tarea crearServicio(Tarea tarea);
    Tarea obtenerPorId(Long id);
    List<Tarea> obtenerTodos();
    boolean eliminar(Long id);


    public String marcarCompletado(Date date);
    public double obtenerCosto();
    public Tarea resumenServicio(Tarea tarea); //que debe retornar?
}
