package com.confiedy.app.dto;


import java.io.Serializable;
/**
 * DTO for {@link Usuario}
 */
public class CursoPorUniversidadDto implements Serializable {
    private Integer id;
    private String curso;
    private String codigoCurso;
    private String imagenCurso;
    private String descripcion;
    private Integer universidadId;
    private String nombreUniversidad;
    private String ciclo;
    private String duracion;
    private String maximoEstudiantes;

    public CursoPorUniversidadDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getImagenCurso() {
        return imagenCurso;
    }

    public void setImagenCurso(String imagenCurso) {
        this.imagenCurso = imagenCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getUniversidadId() {
        return universidadId;
    }

    public void setUniversidadId(Integer universidadId) {
        this.universidadId = universidadId;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getMaximoEstudiantes() {
        return maximoEstudiantes;
    }

    public void setMaximoEstudiantes(String maximoEstudiantes) {
        this.maximoEstudiantes = maximoEstudiantes;
    }
}