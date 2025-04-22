package org.example.modelo;

import java.time.LocalDateTime;

public class Servicio {
    private Long idServicio;
    private String nombre;
    private char nivelServicio;
    private String prioridadServicio;
    private Costo costoServicio;
    private LocalDateTime fechaSolicitudServicio;
    private LocalDateTime fechaFinServicio;
    private Usuario usuarioSolicitante;
    private Usuario usuarioEjecutor;
    private boolean disponibilidadServicio;

    public Servicio(long idServicio, String nombre, char nivelServicio, String prioridadServicio, Costo costoServicio, LocalDateTime fechaSolicitudServicio, LocalDateTime fechaFinServicio, Usuario usuarioSolicitante, Usuario usuarioEjecutor, boolean disponibilidadServicio) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.nivelServicio = nivelServicio;
        this.prioridadServicio = prioridadServicio;
        this.costoServicio = costoServicio;
        this.fechaSolicitudServicio = fechaSolicitudServicio;
        this.fechaFinServicio = fechaFinServicio;
        this.usuarioSolicitante = usuarioSolicitante;
        this.usuarioEjecutor = usuarioEjecutor;
        this.disponibilidadServicio = disponibilidadServicio;
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getNivelServicio() {
        return nivelServicio;
    }

    public void setNivelServicio(char nivelServicio) {
        this.nivelServicio = nivelServicio;
    }

    public String getPrioridadServicio() {
        return prioridadServicio;
    }

    public void setPrioridadServicio(String prioridadServicio) {
        this.prioridadServicio = prioridadServicio;
    }

    public Costo getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(Costo costoServicio) {
        this.costoServicio = costoServicio;
    }

    public LocalDateTime getFechaSolicitudServicio() {
        return fechaSolicitudServicio;
    }

    public void setFechaSolicitudServicio(LocalDateTime fechaSolicitudServicio) {
        this.fechaSolicitudServicio = fechaSolicitudServicio;
    }

    public LocalDateTime getFechaFinServicio() {
        return fechaFinServicio;
    }

    public void setFechaFinServicio(LocalDateTime fechaFinServicio) {
        this.fechaFinServicio = fechaFinServicio;
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

    public boolean isDisponibilidadServicio() {
        return disponibilidadServicio;
    }

    public void setDisponibilidadServicio(boolean disponibilidadServicio) {
        this.disponibilidadServicio = disponibilidadServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idServicio=" + idServicio +
                ", nombre='" + nombre + '\'' +
                ", nivelServicio=" + nivelServicio +
                ", prioridadServicio='" + prioridadServicio + '\'' +
                ", costoServicio=" + costoServicio +
                ", fechaSolicitudServicio=" + fechaSolicitudServicio +
                ", fechaFinServicio=" + fechaFinServicio +
                ", usuarioSolicitante=" + usuarioSolicitante +
                ", usuarioEjecutor=" + usuarioEjecutor +
                ", disponibilidadServicio=" + disponibilidadServicio +
                '}';
    }
}
