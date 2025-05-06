package org.example.tarea.servicio;

import org.example.tarea.dao.TareaDAO;
import org.example.tarea.dao.TareaDAOImpl;
import org.example.tarea.modelo.Tarea;

import java.util.Date;
import java.util.List;

public class TareaServicioImpl implements TareaServicio {
    private final TareaDAO tareaDAO = new TareaDAOImpl();

    @Override
    public Tarea crearServicio(Tarea tarea) {
        return tareaDAO.guardar(tarea);
    }

    @Override
    public Tarea obtenerPorId(Long id) {
        return tareaDAO.obtenerPorId(id);
    }

    @Override
    public List<Tarea> obtenerTodos() {
        return tareaDAO.obtenerTodos();
    }

    @Override
    public boolean eliminar(Long id) {
        return tareaDAO.eliminar(id);
    }


    @Override
    public String marcarCompletado(Date date) {
        return null;
    }

    @Override
    public double obtenerCosto() {
        return 0;
    }

    @Override
    public Tarea resumenServicio(Tarea tarea) {
        return null;
    }
}
