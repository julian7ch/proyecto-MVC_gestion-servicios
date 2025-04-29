package org.example.usuario.dao;

import org.example.usuario.modelo.Usuario;

import java.util.List;

public interface UsuarioDAO {
    Usuario guardar(Usuario usuario);
    Usuario buscarPorId(long idUsuario);
    List<Usuario> obtenerTodos();
    boolean eliminar(long idUsuario);
}

