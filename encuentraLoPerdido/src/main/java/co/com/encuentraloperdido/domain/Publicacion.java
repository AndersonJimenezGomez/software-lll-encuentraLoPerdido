package co.com.encuentraloperdido.domain;

import java.util.Date;

public class Publicacion {

    private Long idPublicacion;
    private Categoria categoria;
    private Date fechaPublicacion;
    private Lugar lugar;
    private Objeto objetoPublicacion;
    private Usuario usuario;
    private Tipo tipoPublicacion;

    public Long getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Objeto getObjetoPublicacion() {
        return objetoPublicacion;
    }

    public void setObjetoPublicacion(Objeto objetoPublicacion) {
        this.objetoPublicacion = objetoPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tipo getTipoPublicacion() {
        return tipoPublicacion;
    }

    public void setTipoPublicacion(Tipo tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }
}
