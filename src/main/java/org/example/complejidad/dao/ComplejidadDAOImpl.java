package org.example.complejidad.dao;

import org.example.complejidad.modelo.Complejidad;

import java.util.List;

import java.util.ArrayList;

public class ComplejidadDAOImpl implements ComplejidadDAO {

    private static final List<Complejidad> lista = new ArrayList<>();

    static {
        lista.add(new Complejidad(1L, "Alta", 10));
        lista.add(new Complejidad(2L, "Media", 5));
        lista.add(new Complejidad(3L, "Baja", 2.5));
    }

    @Override
    public Complejidad obtener(Long id) {
        for (Complejidad c : lista) {
            if (c.getIdComplejidad().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Complejidad> listar() {
        return lista;
    }

    @Override
    public void guardar(Complejidad complejidad) {
        lista.add(complejidad);
    }

    @Override
    public void eliminar(Long id) {
        lista.removeIf(c -> c.getIdComplejidad().equals(id));
    }
}

