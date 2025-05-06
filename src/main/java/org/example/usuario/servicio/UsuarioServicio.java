package org.example.usuario.servicio;

import org.example.tarea.modelo.Tarea;
import org.example.usuario.modelo.Usuario;

import java.util.List;

public interface UsuarioServicio {
    Usuario crearUsuario(Usuario usuario);
    Usuario buscarUsuarioPorId(long idUsuario);
    List<Usuario> obtenerTodosLosUsuarios();
    boolean eliminarUsuario(long idUsuario);
    public Usuario ofrecerServicio(Tarea tarea, Usuario usuario);
    public Usuario solicitarServicio(Tarea tarea, Usuario usuario);

}
