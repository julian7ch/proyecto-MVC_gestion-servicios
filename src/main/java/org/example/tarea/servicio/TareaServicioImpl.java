package org.example.tarea.servicio;

import org.example.tarea.dao.TareaDAOImpl;
import org.example.tarea.modelo.Tarea;

import java.util.List;

public class TareaServicioImpl implements TareaServicio{
    private final TareaDAOImpl tareaDAO;

    public TareaServicioImpl(TareaDAOImpl tareaDAO) {
        this.tareaDAO = tareaDAO;
    }

    @Override
    public Tarea guardarTareaCapaServicio(Tarea tarea) {
        return tareaDAO.guardar(tarea);
    }

    @Override
    public Tarea buscarTareaPorIdCapaServicio(long idTarea) {
        return tareaDAO.buscarPorId(idTarea);
    }

    @Override
    public List<Tarea> obtenerTodasLasTareasCapaServicio() {
        return tareaDAO.consultarTodasLasTareas();
    }

    @Override
    public Tarea actualizarTareaCapaServicio(Tarea tarea) {
        return tareaDAO.actualizar(tarea);
    }

    @Override
    public boolean eliminarTareaCapaServicio(long idTarea) {
        return tareaDAO.eliminar(idTarea);
    }

    @Override
    public boolean habilitarTareaCapaServicio(long idTarea) {
        return tareaDAO.habilitarTarea(idTarea);
    }
}
