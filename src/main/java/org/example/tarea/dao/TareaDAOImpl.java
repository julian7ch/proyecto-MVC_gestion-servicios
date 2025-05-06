package org.example.tarea.dao;

import org.example.tarea.modelo.Tarea;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class TareaDAOImpl implements TareaDAO {

    private static List<Tarea> listaTareas = new ArrayList<>();
    private static AtomicLong contadorId = new AtomicLong(1);
    
    static {
        Tarea s1 = new Tarea("Tarea 1", "Alto", "Alta", null,
                LocalDateTime.now(), LocalDateTime.now().plusDays(5), null, null, true);
        s1.setIdTarea(contadorId.getAndIncrement());

        Tarea s2 = new Tarea("Tarea 2", "Medio", "Normal", null,
                LocalDateTime.now(), LocalDateTime.now().plusDays(10), null, null, false);
        s2.setIdTarea(contadorId.getAndIncrement());

        listaTareas.add(s1);
        listaTareas.add(s2);
    }

    @Override
    public Tarea guardar(Tarea tarea) {
        if (tarea.getIdTarea() == null) {
            tarea.setIdTarea(contadorId.getAndIncrement());
        }
        listaTareas.add(tarea);
        return tarea;
    }

    @Override
    public Tarea obtenerPorId(Long id) {
        for (Tarea tarea : listaTareas) {
            if (tarea.getIdTarea().equals(id)) {
                System.out.println(tarea);
                return tarea;
            }
        }
        return null;
    }

    @Override
    public List<Tarea> obtenerTodos() {
        System.out.println(listaTareas);
        return listaTareas;
    }

    @Override
    public boolean eliminar(Long id) {
        return listaTareas.removeIf(Tarea -> Tarea.getIdTarea().equals(id));
    }
}
