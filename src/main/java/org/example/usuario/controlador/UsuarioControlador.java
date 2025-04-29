package org.example.usuario.controlador;

import org.example.usuario.modelo.Usuario;
import org.example.usuario.servicio.UsuarioServicio;

import java.util.ArrayList;
import java.util.List;

public class UsuarioControlador {

    private final UsuarioServicio usuarioServicio;

    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    public String crearUsuario(Usuario usuario) {
        usuarioServicio.guardarUsuario(usuario);
        return "Usuario creado con éxito.";
    }

    public Usuario consultarUsuarioPorId(long id) {
        return usuarioServicio.buscarUsuarioPorId(id);
    }

    public List<Usuario> obtenerListaUsuarios() {
        return usuarioServicio.obtenerTodosLosUsuarios();
    }

    public boolean eliminarUsuario(long id) {
        return usuarioServicio.eliminarUsuario(id);
    }
}

