package com.confiedy.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 225)
    @Column(name = "descripcion", length = 225)
    private String descripcion;

    @Size(max = 145)
    @Column(name = "tipo", length = 45)
    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
