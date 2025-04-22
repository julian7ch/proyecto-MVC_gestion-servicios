package org.example.controlador;

import org.example.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioControlador {
    private final List<Usuario> listaUsuarios = new ArrayList<>();

    public String crearUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        return "Usuario creado con exito";
           }

    public Usuario consultarUsuarioPorId(long id){
        for(Usuario u : listaUsuarios){
            if(u.getIdUsuario().equals(id)){
                return u;
            }
        }
        return null;
    }

    public List<Usuario> obtenerListaUsuarios(){
        return listaUsuarios;
    }

    public boolean removerUsuario (long id){
        return listaUsuarios.removeIf(usuario -> usuario.getIdUsuario().equals(id));
    }
}
