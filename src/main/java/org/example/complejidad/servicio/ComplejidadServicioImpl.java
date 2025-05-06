package org.example.complejidad.servicio;

import org.example.categoria.modelo.Categoria;
import org.example.complejidad.dao.ComplejidadDAO;
import org.example.complejidad.dao.ComplejidadDAOImpl;
import org.example.complejidad.modelo.Complejidad;

import java.util.List;

public class ComplejidadServicioImpl implements ComplejidadServicio {

    private final ComplejidadDAO complejidadDAO = new ComplejidadDAOImpl();

    @Override
    public double definirComplejidad(Categoria categoria) {
        return 0;
    }

    @Override
    public Complejidad obtenerEstadoComplejidadporId(Long id) {
        return complejidadDAO.obtener(id);
    }

    @Override
    public List<Complejidad> obtenerTodosLosEstado() {
        return complejidadDAO.listar();
    }

    @Override
    public String agregarComplejidad(Complejidad complejidad) {
        complejidadDAO.guardar(complejidad);
        return "Complejidad agregada exitosamente.";
    }

    @Override
    public String removerComplejidadPorId(Long id) {
        complejidadDAO.eliminar(id);
        return "Complejidad eliminada exitosamente.";
    }
}
