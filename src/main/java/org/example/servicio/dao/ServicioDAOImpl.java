package org.example.servicio.dao;

import org.example.servicio.modelo.Servicio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ServicioDAOImpl implements ServicioDAO {

    private static List<Servicio> listaServicios = new ArrayList<>();

    static {
        // Crear algunos servicios de prueba
        listaServicios.add(new Servicio(1L, "Servicio 1", "Alto", "Alta", null,
                LocalDateTime.now(), LocalDateTime.now().plusDays(5), null, null, true));
        listaServicios.add(new Servicio(2L, "Servicio 2", "Medio", "Normal", null,
                LocalDateTime.now(), LocalDateTime.now().plusDays(10), null, null, false));
    }
    @Override
    public Servicio guardar(Servicio servicio) {
        listaServicios.add(servicio);
        return servicio;
    }

    @Override
    public Servicio obtenerPorId(Long id) {
        for (Servicio servicio : listaServicios) {
            if (servicio.getIdServicio().equals(id)) {
                return servicio;
            }
        }
        return null;
    }

    @Override
    public List<Servicio> obtenerTodos() {
        return listaServicios;
    }

    @Override
    public boolean eliminar(Long id) {
        return listaServicios.removeIf(servicio -> servicio.getIdServicio().equals(id));
    }
}
