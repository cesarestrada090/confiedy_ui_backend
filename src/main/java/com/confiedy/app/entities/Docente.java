package com.confiedy.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "docentes")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 145)
    @Column(name = "nombre", length = 45)
    private String nombre;
    @Size(max = 145)
    @Column(name = "imagen_perfil", length = 45)
    private String imagenPerfil;
    @Column(name = "numero_estrellas", nullable = false)
    private Integer numeroEstrellas;

    @Column(name = "horas_dictadas", nullable = false)
    private Integer horasDictadas;

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

    public Integer getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(Integer horasDictadas) {
        this.horasDictadas = horasDictadas;
    }
}