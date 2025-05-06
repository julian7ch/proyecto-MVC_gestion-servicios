package org.example.tarea.modelo;

import org.example.costo.modelo.Costo;
import org.example.usuario.modelo.Usuario;

import java.time.LocalDateTime;

public class Tarea {
    private Long idTarea;
    private String nombre;
    private String nivelTarea;
    private String prioridadTarea;
    private Costo costoTarea;
    private LocalDateTime fechaSolicitudTarea;
    private LocalDateTime fechaFinTarea;
    private Usuario usuarioSolicitante;
    private Usuario usuarioEjecutor;
    private boolean disponibilidadTarea;

    public Tarea(String nombre, String nivelTarea, String prioridadTarea, Costo costoTarea, LocalDateTime fechaSolicitudTarea, LocalDateTime fechaFinTarea, Usuario usuarioSolicitante, Usuario usuarioEjecutor, boolean disponibilidadTarea) {
        //this.idTarea = idTarea;
        this.nombre = nombre;
        this.nivelTarea = nivelTarea;
        this.prioridadTarea = prioridadTarea;
        this.costoTarea = costoTarea;
        this.fechaSolicitudTarea = fechaSolicitudTarea;
        this.fechaFinTarea = fechaFinTarea;
        this.usuarioSolicitante = usuarioSolicitante;
        this.usuarioEjecutor = usuarioEjecutor;
        this.disponibilidadTarea = disponibilidadTarea;
    }

    public Long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Long idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelTarea() {
        return nivelTarea;
    }

    public void setNivelTarea(String nivelTarea) {
        this.nivelTarea = nivelTarea;
    }

    public String getPrioridadTarea() {
        return prioridadTarea;
    }

    public void setPrioridadTarea(String prioridadTarea) {
        this.prioridadTarea = prioridadTarea;
    }

    public Costo getCostoTarea() {
        return costoTarea;
    }

    public void setCostoTarea(Costo costoTarea) {
        this.costoTarea = costoTarea;
    }

    public LocalDateTime getFechaSolicitudTarea() {
        return fechaSolicitudTarea;
    }

    public void setFechaSolicitudTarea(LocalDateTime fechaSolicitudTarea) {
        this.fechaSolicitudTarea = fechaSolicitudTarea;
    }

    public LocalDateTime getFechaFinTarea() {
        return fechaFinTarea;
    }

    public void setFechaFinTarea(LocalDateTime fechaFinTarea) {
        this.fechaFinTarea = fechaFinTarea;
    }

    public Usuario getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(Usuario usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public Usuario getUsuarioEjecutor() {
        return usuarioEjecutor;
    }

    public void setUsuarioEjecutor(Usuario usuarioEjecutor) {
        this.usuarioEjecutor = usuarioEjecutor;
    }

    public boolean isDisponibilidadTarea() {
        return disponibilidadTarea;
    }

    public void setDisponibilidadTarea(boolean disponibilidadTarea) {
        this.disponibilidadTarea = disponibilidadTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "idTarea=" + idTarea +
                ", nombre='" + nombre + '\'' +
                ", nivelTarea=" + nivelTarea +
                ", prioridadTarea='" + prioridadTarea + '\'' +
                ", costoTarea=" + costoTarea +
                ", fechaSolicitudTarea=" + fechaSolicitudTarea +
                ", fechaFinTarea=" + fechaFinTarea +
                ", usuarioSolicitante=" + usuarioSolicitante +
                ", usuarioEjecutor=" + usuarioEjecutor +
                ", disponibilidadTarea=" + disponibilidadTarea +
                '}';
    }
}
