package org.example.vista;

import org.example.costo.modelo.Costo;
import org.example.tarea.controlador.TareaControlador;
import org.example.tarea.modelo.Tarea;
import org.example.tarea.servicio.TareaServicioImpl;
import org.example.usuario.modelo.Usuario;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class TareaVista {
    private final TareaControlador tareaControlador =
            new TareaControlador(new TareaServicioImpl());
    private final Scanner scanner = new Scanner(System.in);

    public TareaVista() {
        crearTareaPredeterminado( "Gas", "B", "Media");
    }

    public void crearTareaPredeterminado( String nombre, String nivel, String prioridad){
        Tarea tarea = new Tarea(
                nombre,
                nivel,
                prioridad,
                null,
                LocalDateTime.now(),
                null,
                null,
                null,
                true
        );
        tareaControlador.crearTarea(tarea);
    }


    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("""
                    por favor elija una de las siguientes opciones:
                    1. crear tarea
                    2. obtener tarea por ID
                    3. listar todas las Tareas
                    4. remover tarea
                    0. salir del aplicativo
                    """);
            System.out.print("Elija una opcion por favor: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1 -> crearTarea();
                case 2 -> obtenerTareaPorId();
                case 3 -> listarTodosLosTareas();
                case 4 -> removerTarea();
                case 0 -> System.out.println("saliendo del sistema---");
                default -> System.out.println("opcion elegida no es valida solo se permite una de las anteriores");
            }
        }while (opcion!=0);
    }

    public Tarea crearTarea(){
        System.out.println("por favor complete los siguientes parametros: ");
        System.out.println("ingrese ID luego se debe automatizar: ");
        Long idTarea = scanner.nextLong();
        scanner.nextLine();
        System.out.println("ingrese nombre del tarea: ");
        String nombre = scanner.nextLine();
        System.out.println("elija prioridad: ");
        String prioridad = scanner.nextLine();
        System.out.println("ingrese Nivel del tarea: ");
        String nivel = scanner.nextLine();
        LocalDateTime fechaSolicitudTarea = LocalDateTime.now();
        LocalDateTime fechaFinTarea = null;
        Usuario solicitante = null;

        Usuario usuarioEjecutor = null;
        boolean disponibilidadTarea = true;
        Costo costo = null;

        Tarea nuevoTarea = new Tarea(nombre,nivel, prioridad,costo,
                fechaSolicitudTarea,fechaFinTarea,solicitante,usuarioEjecutor,
                disponibilidadTarea);
        System.out.println(" SU Tarea HA SIDO CREADO CON EXITO¡¡¡" + nuevoTarea.toString());
        tareaControlador.crearTarea(nuevoTarea);
        return nuevoTarea;
    }

    Tarea obtenerTareaPorId(){
        System.out.print("ingrese el id de su tarea: ");
        Long id = scanner.nextLong();
        //tareaControlador.obtenerTareaPorId(id).toString();
        return tareaControlador.obtenerTareaPorId(id);
    }

    List<Tarea> listarTodosLosTareas(){
        return tareaControlador.obtenerListaTareas();
    }

    boolean removerTarea(){
        System.out.print("ingrese el servivio que desea eliminar: ");
        Long id = scanner.nextLong();
        return tareaControlador.borrarTareaPorId(id);
    }


}
