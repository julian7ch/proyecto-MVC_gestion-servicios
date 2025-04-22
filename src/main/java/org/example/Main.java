package org.example;

import org.example.vista.ServicioVista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServicioVista servicioVista = new ServicioVista();
        servicioVista.crearServicioPredeterminado(100L, "Julian", 'C', "Alta");
        servicioVista.mostrarMenu();
    }
}