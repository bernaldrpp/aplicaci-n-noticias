package com.bernald.infile.test.server.entity;

import jakarta.persistence.*;

@Entity
@Table(name="noticia")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "titular")
    private String titular;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "fecha_publicacion")
    private String fecha_publicacion;

    public Noticia(){}

    public Noticia(String titular, String imagen, String descripcion, String contenido, String fecha_publicacion) {
        this.titular = titular;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.contenido = contenido;
        this.fecha_publicacion = fecha_publicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "id=" + id +
                ", titular='" + titular + '\'' +
                ", imagen='" + imagen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fecha_publicacion='" + fecha_publicacion + '\'' +
                '}';
    }
}
