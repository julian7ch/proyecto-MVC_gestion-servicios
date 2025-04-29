package org.example.usuario.dao;

import org.example.usuario.modelo.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO{
    private final List<Usuario> listaUsuarios = new ArrayList<>();

    public UsuarioDAOImpl() {
        // Cargar usuarios de prueba
        listaUsuarios.add(new Usuario(
                1L,
                "Juan Pérez",
                'C',
                12345678,
                LocalDateTime.of(1990, 5, 15, 0, 0),
                'M',
                "juan.perez@example.com",
                "password123",
                LocalDateTime.now()
        ));

        listaUsuarios.add(new Usuario(
                2L,
                "María Gómez",
                'P',
                87654321,
                LocalDateTime.of(1985, 8, 20, 0, 0),
                'F',
                "maria.gomez@example.com",
                "securepass456",
                LocalDateTime.now()
        ));
    }
    @Override
    public Usuario guardar(Usuario usuario) {
        listaUsuarios.add(usuario);
        return usuario;
    }

    @Override
    public Usuario buscarPorId(long idUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return new ArrayList<>(listaUsuarios);
    }

    @Override
    public boolean eliminar(long idUsuario) {
        return listaUsuarios.removeIf(usuario -> usuario.getIdUsuario().equals(idUsuario));
    }
}
