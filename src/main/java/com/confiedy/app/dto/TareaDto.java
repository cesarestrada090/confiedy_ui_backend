package com.confiedy.app.dto;

import java.io.Serializable;

public class TareaDto implements Serializable {
    private Integer id;
    private String descripcion;
    private Integer estado;

    public TareaDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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