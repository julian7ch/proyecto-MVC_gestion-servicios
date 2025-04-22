package org.example.modelo;

import java.time.LocalDateTime;

public class Usuario {
    private Long idUsuario;
    private String nombreUsuario;
    private char tipoDocumentoUsuario;
    private Integer numeroDocumentoUsuario;
    private LocalDateTime fechaNacimiento;
    private char genero;
    private String emailUsuario;
    private String password;
    private LocalDateTime ultimoLogin;

    public Usuario(Long idUsuario, String nombreUsuario, char tipoDocumentoUsuario, Integer numeroDocumentoUsuario, LocalDateTime fechaNacimiento, char genero, String emailUsuario, String password, LocalDateTime ultimoLogin) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.tipoDocumentoUsuario = tipoDocumentoUsuario;
        this.numeroDocumentoUsuario = numeroDocumentoUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.emailUsuario = emailUsuario;
        this.password = password;
        this.ultimoLogin = ultimoLogin;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public char getTipoDocumentoUsuario() {
        return tipoDocumentoUsuario;
    }

    public void setTipoDocumentoUsuario(char tipoDocumentoUsuario) {
        this.tipoDocumentoUsuario = tipoDocumentoUsuario;
    }

    public Integer getNumeroDocumentoUsuario() {
        return numeroDocumentoUsuario;
    }

    public void setNumeroDocumentoUsuario(Integer numeroDocumentoUsuario) {
        this.numeroDocumentoUsuario = numeroDocumentoUsuario;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", tipoDocumentoUsuario=" + tipoDocumentoUsuario +
                ", numeroDocumentoUsuario=" + numeroDocumentoUsuario +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero=" + genero +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", password='" + password + '\'' +
                ", ultimoLogin=" + ultimoLogin +
                '}';
    }
}
