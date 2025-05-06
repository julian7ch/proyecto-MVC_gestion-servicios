package org.example.categoria.servicio;

import org.example.categoria.modelo.Categoria;

import java.util.List;

public interface CategoriaServicio {

    Categoria guardarCategoriaCapaServicio(Categoria categoria);

    Categoria buscarCategoriaPorIdCapaServicio(long idCategoria);

    List<Categoria> obtenerTodasLasCategoriasCapaServicio();

    Categoria actualizarCategoriaCapaServicio(Categoria categoria);

    boolean eliminarCategoriaCapaServicio(long idCategoria);

    boolean habilitarCategoriaCapaServicio(long idCategoria);
}
