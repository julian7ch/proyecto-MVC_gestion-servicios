package org.example.usuario.servicio;

import org.example.servicio.modelo.Servicio;
import org.example.usuario.modelo.Usuario;

import java.util.Date;
import java.util.List;

public interface UsuarioServicio {
    Usuario guardarUsuario(Usuario usuario);
    Usuario buscarUsuarioPorId(long idUsuario);
    List<Usuario> obtenerTodosLosUsuarios();
    boolean eliminarUsuario(long idUsuario);
    public Usuario ofrecerServicio(Servicio servicio, Usuario usuario);
    public Usuario solicitarServicio(Servicio servicio, Usuario usuario);

}
