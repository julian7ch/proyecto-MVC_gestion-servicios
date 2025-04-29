package org.example.vista;

import org.example.servicio.controlador.ServicioControlador;
import org.example.costo.modelo.Costo;
import org.example.servicio.modelo.Servicio;
import org.example.usuario.modelo.Usuario;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ServicioVista {
    private final ServicioControlador servicioControlador = new ServicioControlador();
    private final Scanner scanner = new Scanner(System.in);

    public ServicioVista() {
        crearServicioPredeterminado(101L, "Gas", "B", "Media");
    }

    public void crearServicioPredeterminado(Long id, String nombre, String nivel, String prioridad){
        Servicio servicio = new Servicio(
                id,
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
        servicioControlador.crearServicio(servicio);
    }


    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("""
                    por favor elija una de las siguientes opciones:
                    1.crear servicio
                    2. obtener servicio por ID
                    3. listar todos los servicios
                    4. remover servicio
                    0. salir del aplicativo
                    """);
            System.out.print("Elija una opcion por favor: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1 -> crearServicio();
                case 2 -> obtenerServicioPorId();
                case 3 -> listarTodosLosServicios();
                case 4 -> removerServicio();
                case 0 -> System.out.println("saliendo del sistema---");
                default -> System.out.println("opcion elegida no es valida solo se permite una de las anteriores");
            }
        }while (opcion!=0);
    }

    public Servicio crearServicio(){
        System.out.println("por favor complete los siguientes parametros: ");
        System.out.println("ingrese ID luego se debe automatizar: ");
        Long idServicio = scanner.nextLong();
        scanner.nextLine();
        System.out.println("ingrese nombre del servicio: ");
        String nombre = scanner.nextLine();
        System.out.println("elija prioridad: ");
        String prioridad = scanner.nextLine();
        System.out.println("ingrese Nivel del servicio: ");
        String nivel = scanner.nextLine();
        LocalDateTime fechaSolicitudServicio = LocalDateTime.now();
        LocalDateTime fechaFinServicio = null;
        Usuario solicitante = null;

        Usuario usuarioEjecutor = null;
        boolean disponibilidadServicio = true;
        Costo costo = null;

        Servicio nuevoServicio = new Servicio(idServicio,nombre,nivel, prioridad,costo,
                fechaSolicitudServicio,fechaFinServicio,solicitante,usuarioEjecutor,
                disponibilidadServicio);
        System.out.println(" SU SERVICIO HA SIDO CREADO CON EXITO¡¡¡" + nuevoServicio.toString());
        servicioControlador.crearServicio(nuevoServicio);
        return nuevoServicio;
    }

    Servicio obtenerServicioPorId(){
        System.out.println("ingrese el id de su servicio: ");
        Long id = scanner.nextLong();
        //servicioControlador.obtenerServicioPorId(id).toString();
        return servicioControlador.obtenerServicioPorId(id);
    }

    List<Servicio> listarTodosLosServicios(){
        return servicioControlador.obtenerListaServicios();
    }

    boolean removerServicio(){
        System.out.println("ingrese el servivio que desea eliminar: ");
        Long id = scanner.nextLong();
        return servicioControlador.borrarServicioPorId(id);
    }


}
