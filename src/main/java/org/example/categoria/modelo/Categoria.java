package org.example.categoria.modelo;

public class Categoria {
    private long idCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;
    private String tipoCategoria;
    private char nivelCategoria;
    private boolean categoriaDispnible;

    public Categoria(long idCategoria, String nombreCategoria, String descripcionCategoria, String tipoCategoria, char nivelCategoria, boolean categoriaDispnible) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.tipoCategoria = tipoCategoria;
        this.nivelCategoria = nivelCategoria;
        this.categoriaDispnible = categoriaDispnible;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public char getNivelCategoria() {
        return nivelCategoria;
    }

    public void setNivelCategoria(char nivelCategoria) {
        this.nivelCategoria = nivelCategoria;
    }

    public boolean isCategoriaDispnible() {
        return categoriaDispnible;
    }

    public void setCategoriaDispnible(boolean categoriaDispnible) {
        this.categoriaDispnible = categoriaDispnible;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                ", descripcionCategoria='" + descripcionCategoria + '\'' +
                ", tipoCategoria='" + tipoCategoria + '\'' +
                ", nivelCategoria=" + nivelCategoria +
                ", CategoriaDispnible=" + categoriaDispnible +
                '}';
    }
}
