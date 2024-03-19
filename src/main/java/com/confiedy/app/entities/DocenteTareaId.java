package com.confiedy.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DocenteTareaId implements Serializable {
    private static final long serialVersionUID = 1605247810173684734L;
    @Column(name = "id_docente", nullable = false)
    private Integer docenteId;

    @Column(name = "id_tarea", nullable = false)
    private Integer tareaId;

    public DocenteTareaId() {
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Integer getTareaId() {
        return tareaId;
    }

    public void setTareaId(Integer tareaId) {
        this.tareaId = tareaId;
    }
}