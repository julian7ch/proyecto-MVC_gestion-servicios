package org.example.servicio.controlador;

import org.example.servicio.modelo.Servicio;
import org.example.servicio.servicio.ServicioNegocio;

import java.util.List;

public class ServicioControlador {
    private final ServicioNegocio servicioNegocio = null;

//    public ServicioControlador(ServicioNegocio servicioNegocio) {
//        this.servicioNegocio = servicioNegocio;
//    }


    public Servicio crearServicio(Servicio servicio) {
        return servicioNegocio.guardar(servicio);
    }

    public Servicio obtenerServicioPorId(Long id) {
        return servicioNegocio.obtenerPorId(id);
    }

    public List<Servicio> obtenerListaServicios() {
        return servicioNegocio.obtenerTodos();
    }

    public boolean borrarServicioPorId(Long id) {
        return servicioNegocio.eliminar(id);
    }
}

