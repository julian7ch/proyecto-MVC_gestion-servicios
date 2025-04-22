package org.example.controlador;

import org.example.modelo.Servicio;

import java.util.ArrayList;
import java.util.List;

public class ServicioControlador {
    private final List<Servicio> listaServicios = new ArrayList<>();

    public Servicio crearServicio(Servicio servicio){
        listaServicios.add(servicio);
        return servicio;
    }

    public Servicio obtenerServicioPorId(Long id){
        for(Servicio servicio: listaServicios){
            if(servicio.getIdServicio().equals(id)){
                System.out.println(" el servicio soliitado es " + servicio);
                return servicio;
            }
        }
        return null;
    }

    public List<Servicio> obtenerListaServicios(){
        System.out.println("Lista de servicios: " + listaServicios.toString());
        return listaServicios;
    }

    public boolean borrarServiceporId(Long id){
        System.out.println("el servicio " + id + " ha sido borrado con exito");
       return listaServicios.removeIf(servicio -> servicio.getIdServicio().equals(id));
    }
}
