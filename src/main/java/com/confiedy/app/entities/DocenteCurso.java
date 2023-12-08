package com.confiedy.app.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alumno_evaluacion_curso")
public class DocenteCurso {
    @EmbeddedId
    private DocenteCursoId id;

    @MapsId("cursoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @MapsId("docenteId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "docente_id", nullable = false)
    private Docente docente;

    @Column(name = "estado")
    Integer estado;

    public DocenteCurso() {
    }

    public DocenteCursoId getId() {
        return id;
    }

    public void setId(DocenteCursoId id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}