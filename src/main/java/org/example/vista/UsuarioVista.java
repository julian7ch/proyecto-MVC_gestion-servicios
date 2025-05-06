package org.example.vista;

import org.example.tarea.modelo.Tarea;
import org.example.usuario.controlador.UsuarioControlador;
import org.example.usuario.modelo.Usuario;
import org.example.usuario.servicio.UsuarioServicioImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class UsuarioVista {
    private final UsuarioControlador usuarioControlador = new UsuarioControlador(new UsuarioServicioImpl());
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("--- CREAR USUARIO ---");
        int opcion;
        do {
            System.out.println("""
                    por favor elija una de las siguientes opciones:
                    1. crear usuario
                    2. obtener usuario por ID xxx
                    3. listar todas los usuarios
                    4. remover usuario
                    0. salir del aplicativo
                    """);
            System.out.print("Elija una opcion por favor: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1 -> crearUsuario();
               // case 2 -> obtenerUsuarioPorId();
                case 3 -> listarTodosLosUsuarios();
                case 4 -> removerUsuario();
                case 0 -> System.out.println("saliendo del sistema---");
                default -> System.out.println("opcion elegida no es valida solo se permite una de las anteriores");
            }
        }while (opcion!=0);
    }

    public Usuario crearUsuario(){
        System.out.println("por favor complete los siguientes parametros: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID del usuario:");
        Long idUsuario = Long.parseLong(scanner.nextLine());

        System.out.println("Ingrese el nombre del usuario:");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese el tipo de documento (una letra, por ejemplo 'C' o 'N'):");
        char tipoDocumentoUsuario = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el número de documento:");
        Integer numeroDocumentoUsuario = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la fecha de nacimiento (formato yyyy-MM-dd):");
        LocalDateTime fechaNacimiento = LocalDate.parse(scanner.nextLine()).atStartOfDay();

        System.out.println("Ingrese el género (una letra, por ejemplo 'M' o 'F'):");
        char genero = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el email del usuario:");
        String emailUsuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña:");
        String password = scanner.nextLine();

        LocalDateTime ultimoLogin = LocalDateTime.now();

        Usuario nuevoUsuario = new Usuario(nombreUsuario, tipoDocumentoUsuario, numeroDocumentoUsuario,fechaNacimiento,
                genero, emailUsuario, password, ultimoLogin);
        System.out.println(" SU USUARIO HA SIDO CREADO CON EXITO¡¡¡" + emailUsuario.toString());
        usuarioControlador.crearUsuario(nuevoUsuario);
        return nuevoUsuario;
    }

    public List<Usuario> listarTodosLosUsuarios(){
        return usuarioControlador.obtenerListaUsuarios();
    }

    boolean removerUsuario(){
        System.out.print("ingrese el usuario que desea eliminar: ");
        Long id = scanner.nextLong();
        return usuarioControlador.eliminarUsuario(id);
    }
}
