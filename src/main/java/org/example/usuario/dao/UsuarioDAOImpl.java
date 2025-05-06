package org.example.usuario.dao;

import org.example.usuario.modelo.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class UsuarioDAOImpl implements UsuarioDAO{
    private final List<Usuario> listaUsuarios = new ArrayList<>();
    private static AtomicLong contadorId = new AtomicLong(1);

    public UsuarioDAOImpl() {
        // Cargar usuarios de prueba
        Usuario usuario1 = new Usuario(
                "Juan Pérez",
                'C',
                12345678,
                LocalDateTime.of(1990, 5, 15, 0, 0),
                'M',
                "juan.perez@example.com",
                "password123",
                LocalDateTime.now()
        );

        Usuario usuario2 = new Usuario(
                "María Gómez",
                'P',
                87654321,
                LocalDateTime.of(1985, 8, 20, 0, 0),
                'F',
                "maria.gomez@example.com",
                "securepass456",
                LocalDateTime.now()
        );
        usuario1.setIdUsuario(contadorId.getAndIncrement());
        usuario2.setIdUsuario(contadorId.getAndIncrement());

        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
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
        System.out.println(listaUsuarios);
        return listaUsuarios;
    }

    @Override
    public boolean eliminar(long idUsuario) {
        return listaUsuarios.removeIf(usuario -> usuario.getIdUsuario().equals(idUsuario));
    }
}
