package org.example.servicio.servicio;

import org.example.servicio.dao.ServicioDAO;
import org.example.servicio.modelo.Servicio;
import org.example.usuario.modelo.Usuario;

import java.util.Date;
import java.util.List;

public class ServicioNegocioImpl implements ServicioNegocio{
    private final ServicioDAO servicioDAO;

    public ServicioNegocioImpl(ServicioDAO servicioDAO) {
        this.servicioDAO = servicioDAO;
    }

    @Override
    public Servicio guardar(Servicio servicio) {
        return servicioDAO.guardar(servicio);
    }

    @Override
    public Servicio obtenerPorId(Long id) {
        return servicioDAO.obtenerPorId(id);
    }

    @Override
    public List<Servicio> obtenerTodos() {
        return servicioDAO.obtenerTodos();
    }

    @Override
    public boolean eliminar(Long id) {
        return servicioDAO.eliminar(id);
    }

    @Override
    public String asignarSolicitante(Usuario usuario) {
        return null;
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
    public Servicio resumenServicio(Servicio servicio) {
        return null;
    }
}
