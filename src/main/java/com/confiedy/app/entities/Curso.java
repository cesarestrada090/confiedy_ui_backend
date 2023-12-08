package com.confiedy.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "codigo", length = 45)
    private String codigo;

    @Size(max = 45)
    @Column(name = "nombre", length = 45)
    private String nombre;

    @Size(max = 445)
    @Column(name = "descripcion", length = 45)
    private String descripcion;

    @Size(max = 45)
    @Column(name = "imagen_curso", length = 345)
    private String imagenCurso;

    @Size(max = 45)
    @Column(name = "ciclo", length = 45)
    private String ciclo;

    @Size(max = 45)
    @Column(name = "duracion", length = 45)
    private String duracion;


    @Column(name = "maximo_estudiantes")
    private String maximoEstudiantes;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name =  "universidad_id")
    private Universidad universidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public String getImagenCurso() {
        return imagenCurso;
    }

    public void setImagenCurso(String imagenCurso) {
        this.imagenCurso = imagenCurso;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaximoEstudiantes() {
        return maximoEstudiantes;
    }

    public void setMaximoEstudiantes(String maximoEstudiantes) {
        this.maximoEstudiantes = maximoEstudiantes;
    }
}