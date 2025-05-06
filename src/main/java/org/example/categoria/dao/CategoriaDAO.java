package org.example.categoria.dao;

import org.example.categoria.modelo.Categoria;

import java.util.List;

public interface CategoriaDAO {

    Categoria guardar(Categoria categoria);

    Categoria buscarPorId(long idCategoria);
    List<Categoria> consultarTodasLasCategorias();

    Categoria actualizar(Categoria categoria);

    boolean eliminar(long idCategoria);

    boolean habilitarCategoria(long idCategoria);
}

