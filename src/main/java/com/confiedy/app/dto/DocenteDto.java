package com.confiedy.app.dto;

import java.io.Serializable;

/**
 * DTO for {@link Usuario}
 */
public class DocenteDto implements Serializable {
    private Integer id;
    private Integer docenteId;
    private String docente;
    private String imagenPerfil;
    private String imagenPerfilMenor;
    private Integer numeroEstrellas;
    private Integer numeroHorasDictadas;
    public DocenteDto() {
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

    public String getImagenPerfilMenor() {
        return imagenPerfilMenor;
    }

    public void setImagenPerfilMenor(String imagenPerfilMenor) {
        this.imagenPerfilMenor = imagenPerfilMenor;
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
}