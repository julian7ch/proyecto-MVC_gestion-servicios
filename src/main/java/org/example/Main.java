package org.example;

import org.example.complejidad.modelo.Complejidad;
import org.example.vista.ServicioVista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServicioVista servicioVista = new ServicioVista();
        Complejidad complejidadlista = new Complejidad(1L,"Media",5);
        servicioVista.crearServicioPredeterminado(100L, "Julian", "C", "Alta");
        servicioVista.mostrarMenu();
    }
}