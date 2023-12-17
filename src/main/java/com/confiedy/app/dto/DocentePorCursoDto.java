package com.confiedy.app.dto;

import java.io.Serializable;

/**
 * DTO for {@link Usuario}
 */
public class DocentePorCursoDto implements Serializable {
    private Integer id;
    private Integer docenteId;
    private String docente;
    private String imagenPerfil;
    private String descripcion;
    private Integer numeroEstrellas;
    private Integer numeroHorasDictadas;
    private Integer numeroCalificaciones;
    private Integer cursoId;
    private String curso;
    public DocentePorCursoDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public Integer getNumeroEstrellas() {
        return numeroEstrellas;
    }

    public void setNumeroEstrellas(Integer numeroEstrellas) {
        this.numeroEstrellas = numeroEstrellas;
    }

    public Integer getNumeroHorasDictadas() {
        return numeroHorasDictadas;
    }

    public void setNumeroHorasDictadas(Integer numeroHorasDictadas) {
        this.numeroHorasDictadas = numeroHorasDictadas;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumeroCalificaciones() {
        return numeroCalificaciones;
    }

    public void setNumeroCalificaciones(Integer numeroCalificaciones) {
        this.numeroCalificaciones = numeroCalificaciones;
    }
}