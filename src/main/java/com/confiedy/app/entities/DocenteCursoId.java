package com.confiedy.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DocenteCursoId implements Serializable {
    private static final long serialVersionUID = 1605247810173684734L;
    @Column(name = "docente_id", nullable = false)
    private Integer docenteId;

    @Column(name = "curso_id", nullable = false)
    private Integer cursoId;

    public DocenteCursoId() {
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }
}