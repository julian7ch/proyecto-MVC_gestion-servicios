package org.example.categoria.dao;

import org.example.categoria.modelo.Categoria;

import java.util.List;

import java.util.ArrayList;

public class CategoriaDAOImpl implements CategoriaDAO {

    private final List<Categoria> categorias = new ArrayList<>();

    public CategoriaDAOImpl() {
        categorias.add(new Categoria(1L, "Categoria 1", "Entrega Objeto", "Tipo A", '1', true));
        categorias.add(new Categoria(2L, "Categoria 2", "Llevar persona", "Tipo B", '2', false));
        categorias.add(new Categoria(3L, "Categoria 3", "Mantenimiento de equipo", "Tipo C", '1', true));
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        categorias.add(categoria);
        return categoria;
    }

    @Override
    public Categoria buscarPorId(long idCategoria) {
        return categorias.stream()
                .filter(t -> t.getIdCategoria() == idCategoria)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Categoria> consultarTodasLasCategorias() {
        return categorias;
    }

    //actualizar iria en servicio
    @Override
    public Categoria actualizar(Categoria categoria) {
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getIdCategoria() == categoria.getIdCategoria()) {
                categorias.set(i, categoria);
                return categoria;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(long idCategoria) {
        return categorias.removeIf(t -> t.getIdCategoria() == idCategoria);
    }


    //iria en servicio
    @Override
    public boolean habilitarCategoria(long idCategoria) {
        for (Categoria categoria : categorias) {
            if (categoria.getIdCategoria() == idCategoria) {
                categoria.setCategoriaDispnible(true);
                return true;
            }
        }
        return false;
    }
}
