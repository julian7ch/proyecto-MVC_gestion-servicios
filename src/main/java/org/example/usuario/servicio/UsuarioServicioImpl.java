package org.example.usuario.servicio;

import org.example.tarea.modelo.Tarea;
import org.example.usuario.dao.UsuarioDAO;
import org.example.usuario.dao.UsuarioDAOImpl;
import org.example.usuario.modelo.Usuario;

import java.util.List;

public class UsuarioServicioImpl implements UsuarioServicio{

    private final UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    @Override
        public Usuario crearUsuario(Usuario usuario) {
            return usuarioDAO.guardar(usuario);
        }

        @Override
        public Usuario buscarUsuarioPorId(long idUsuario) {
            return usuarioDAO.buscarPorId(idUsuario);
        }

        @Override
        public List<Usuario> obtenerTodosLosUsuarios() {
            return usuarioDAO.obtenerTodos();
        }

        @Override
        public boolean eliminarUsuario(long idUsuario) {
            return usuarioDAO.eliminar(idUsuario);
        }

        @Override
        public Usuario ofrecerServicio(Tarea tarea, Usuario usuario) {
            //usuario.setServicioOfrecido(tarea);
            return usuarioDAO.guardar(usuario);
        }

        @Override
        public Usuario solicitarServicio(Tarea tarea, Usuario usuario) {
            //usuario.setServicioSolicitado(tarea);
            return usuarioDAO.guardar(usuario);
        }


}
