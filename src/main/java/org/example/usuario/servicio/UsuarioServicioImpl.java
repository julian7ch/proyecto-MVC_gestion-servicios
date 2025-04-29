package org.example.usuario.servicio;

import org.example.servicio.modelo.Servicio;
import org.example.usuario.dao.UsuarioDAO;
import org.example.usuario.modelo.Usuario;

import java.util.Date;
import java.util.List;

public class UsuarioServicioImpl implements UsuarioServicio{

        private final UsuarioDAO usuarioDAO;

        public UsuarioServicioImpl(UsuarioDAO usuarioDAO) {
            this.usuarioDAO = usuarioDAO;
        }

        @Override
        public Usuario guardarUsuario(Usuario usuario) {
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
        public Usuario ofrecerServicio(Servicio servicio, Usuario usuario) {
            //usuario.setServicioOfrecido(servicio);
            return usuarioDAO.guardar(usuario);
        }

        @Override
        public Usuario solicitarServicio(Servicio servicio, Usuario usuario) {
            //usuario.setServicioSolicitado(servicio);
            return usuarioDAO.guardar(usuario);
        }


}
