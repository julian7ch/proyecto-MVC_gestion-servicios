package org.example.categoria.controlador;

import org.example.categoria.modelo.Categoria;
import org.example.categoria.servicio.CategoriaServicio;

import java.util.List;

public class CategoriaControlador {

    private final CategoriaServicio categoriaServicio;

    public CategoriaControlador(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    public void crearTarea() {
        Categoria categoria = new Categoria(1L, "Revisión", "Revisar documentación", "Administrativa", 'A', true);
        Categoria resultado = categoriaServicio.guardarCategoriaCapaServicio(categoria);
        System.out.println("Categoria creada: " + resultado.getNombreCategoria());
    }

    public void mostrarTarea(long id) {
        Categoria categoria = categoriaServicio.buscarCategoriaPorIdCapaServicio(id);
        if (categoria != null) {
            System.out.println("Categoria encontrada: " + categoria.getNombreCategoria());
        } else {
            System.out.println("Categoria no encontrada.");
        }
    }

    public void mostrarTodasLasTareas() {
        List<Categoria> categorias = categoriaServicio.obtenerTodasLasCategoriasCapaServicio();
        System.out.println("Listado de categorias:");
        for (Categoria categoria : categorias) {
            System.out.println("- " + categoria.getNombreCategoria());
        }
    }

    public void actualizarTarea(Categoria categoriaActualizada) {
        Categoria categoria = categoriaServicio.actualizarCategoriaCapaServicio(categoriaActualizada);
        System.out.println("Categoria actualizada: " + categoria.getNombreCategoria());
    }

    public void eliminarTarea(long id) {
        boolean eliminado = categoriaServicio.eliminarCategoriaCapaServicio(id);
        System.out.println("¿Categoria eliminada?: " + eliminado);
    }

    public void habilitarTarea(long id) {
        boolean resultado = categoriaServicio.habilitarCategoriaCapaServicio(id);
        System.out.println("¿Categoria habilitada?: " + resultado);
    }
}