package com.confiedy.app.dto;

import java.io.Serializable;

/**
 * DTO for {@link Usuario}
 */
public class UniversidadDto implements Serializable {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer estado;

    public UniversidadDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}