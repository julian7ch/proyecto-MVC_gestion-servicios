package org.example.tarea.dao;

import org.example.tarea.modelo.Tarea;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class TareaDAOImpl implements TareaDAO {

    private final List<Tarea> tareas = new ArrayList<>();

    public TareaDAOImpl() {
        tareas.add(new Tarea(1L, "Tarea 1", "Entrega Objeto", "Tipo A", '1', true));
        tareas.add(new Tarea(2L, "Tarea 2", "Llevar persona", "Tipo B", '2', false));
        tareas.add(new Tarea(3L, "Tarea 3", "Mantenimiento de equipo", "Tipo C", '1', true));
    }

    @Override
    public Tarea guardar(Tarea tarea) {
        tareas.add(tarea);
        return tarea;
    }

    @Override
    public Tarea buscarPorId(long idTarea) {
        return tareas.stream()
                .filter(t -> t.getIdTarea() == idTarea)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Tarea> consultarTodasLasTareas() {
        return new ArrayList<>(tareas);
    }

    @Override
    public Tarea actualizar(Tarea tarea) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getIdTarea() == tarea.getIdTarea()) {
                tareas.set(i, tarea);
                return tarea;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(long idTarea) {
        return tareas.removeIf(t -> t.getIdTarea() == idTarea);
    }

    @Override
    public boolean habilitarTarea(long idTarea) {
        for (Tarea tarea : tareas) {
            if (tarea.getIdTarea() == idTarea) {
                tarea.setTareaDispnible(true);
                return true;
            }
        }
        return false;
    }
}
