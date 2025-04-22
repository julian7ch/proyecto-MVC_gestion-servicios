package org.example.modelo;

public class Tarea {
    private long idTarea;
    private String nombreTarea;
    private String descripcionTarea;
    private String tipoTarea;
    private char nivelTarea;
    private boolean tareaDispnible;

    public Tarea(long idTarea, String nombreTarea, String descripcionTarea, String tipoTarea, char nivelTarea, boolean tareaDispnible) {
        this.idTarea = idTarea;
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
        this.tipoTarea = tipoTarea;
        this.nivelTarea = nivelTarea;
        this.tareaDispnible = tareaDispnible;
    }

    public long getIdTarea() {
        return idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public char getNivelTarea() {
        return nivelTarea;
    }

    public void setNivelTarea(char nivelTarea) {
        this.nivelTarea = nivelTarea;
    }

    public boolean isTareaDispnible() {
        return tareaDispnible;
    }

    public void setTareaDispnible(boolean tareaDispnible) {
        this.tareaDispnible = tareaDispnible;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "idTarea=" + idTarea +
                ", nombreTarea='" + nombreTarea + '\'' +
                ", descripcionTarea='" + descripcionTarea + '\'' +
                ", tipoTarea='" + tipoTarea + '\'' +
                ", nivelTarea=" + nivelTarea +
                ", tareaDispnible=" + tareaDispnible +
                '}';
    }
}
