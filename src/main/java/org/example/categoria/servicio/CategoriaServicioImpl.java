package org.example.categoria.servicio;

import org.example.categoria.dao.CategoriaDAO;
import org.example.categoria.dao.CategoriaDAOImpl;
import org.example.categoria.modelo.Categoria;

import java.util.List;

public class CategoriaServicioImpl implements CategoriaServicio {
    private final CategoriaDAO categoriaDAO;

    public CategoriaServicioImpl(CategoriaDAOImpl categoriaDAO) {
        this.categoriaDAO = categoriaDAO;
    }

    @Override
    public Categoria guardarCategoriaCapaServicio(Categoria categoria) {
        return categoriaDAO.guardar(categoria);
    }

    @Override
    public Categoria buscarCategoriaPorIdCapaServicio(long idCategoria) {
        return categoriaDAO.buscarPorId(idCategoria);
    }

    @Override
    public List<Categoria> obtenerTodasLasCategoriasCapaServicio() {
        return categoriaDAO.consultarTodasLasCategorias();
    }

    @Override
    public Categoria actualizarCategoriaCapaServicio(Categoria categoria) {
        return categoriaDAO.actualizar(categoria);
    }

    @Override
    public boolean eliminarCategoriaCapaServicio(long idCategoria) {
        return categoriaDAO.eliminar(idCategoria);
    }

    @Override
    public boolean habilitarCategoriaCapaServicio(long idCategoria) {
        return categoriaDAO.habilitarCategoria(idCategoria);
    }
}
