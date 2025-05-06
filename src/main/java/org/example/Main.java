package org.example;

import org.example.vista.TareaVista;
import org.example.vista.UsuarioVista;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- INICIO DE APLICACION ---!");
        int opcion;
        do {
            System.out.println("""
                    Por favor elija una de los siguientes canales:
                    1. Usuario
                    2. Tarea
                    0. salir del aplicativo
                    """);
            System.out.print("Elija una opcion por favor: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1 -> gestionUsuario();
                case 2 -> gestionTarea();
                case 0 -> System.out.println("saliendo del sistema---");
                default -> System.out.println("opcion elegida no es valida solo se permite una de las anteriores");
            }
        }while (opcion!=0);



    }
    static void gestionUsuario() {
        UsuarioVista usuarioVista = new UsuarioVista();
        usuarioVista.mostrarMenu();
    }
    static void gestionTarea(){
        TareaVista tareaVista = new TareaVista();
        // Complejidad complejidadlista = new Complejidad(1L,"Media",5);
        tareaVista.crearTareaPredeterminado( "Julian", "C", "Alta");
        tareaVista.mostrarMenu();
    }
}