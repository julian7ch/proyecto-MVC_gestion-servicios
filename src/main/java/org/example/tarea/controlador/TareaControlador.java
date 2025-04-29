package org.example.tarea.controlador;

import org.example.tarea.modelo.Tarea;
import org.example.tarea.servicio.TareaServicio;

import java.util.List;

public class TareaControlador {

    private final TareaServicio tareaServicio;

    public TareaControlador(TareaServicio tareaServicio) {
        this.tareaServicio = tareaServicio;
    }

    public void crearTarea() {
        Tarea tarea = new Tarea(1L, "Revisión", "Revisar documentación", "Administrativa", 'A', true);
        Tarea resultado = tareaServicio.guardarTareaCapaServicio(tarea);
        System.out.println("Tarea creada: " + resultado.getNombreTarea());
    }

    public void mostrarTarea(long id) {
        Tarea tarea = tareaServicio.buscarTareaPorIdCapaServicio(id);
        if (tarea != null) {
            System.out.println("Tarea encontrada: " + tarea.getNombreTarea());
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    public void mostrarTodasLasTareas() {
        List<Tarea> tareas = tareaServicio.obtenerTodasLasTareasCapaServicio();
        System.out.println("Listado de tareas:");
        for (Tarea tarea : tareas) {
            System.out.println("- " + tarea.getNombreTarea());
        }
    }

    public void actualizarTarea(Tarea tareaActualizada) {
        Tarea tarea = tareaServicio.actualizarTareaCapaServicio(tareaActualizada);
        System.out.println("Tarea actualizada: " + tarea.getNombreTarea());
    }

    public void eliminarTarea(long id) {
        boolean eliminado = tareaServicio.eliminarTareaCapaServicio(id);
        System.out.println("¿Tarea eliminada?: " + eliminado);
    }

    public void habilitarTarea(long id) {
        boolean resultado = tareaServicio.habilitarTareaCapaServicio(id);
        System.out.println("¿Tarea habilitada?: " + resultado);
    }
}