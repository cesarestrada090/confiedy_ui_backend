package com.confiedy.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "docente_tarea")
public class DocenteTarea {
    @EmbeddedId
    private DocenteTareaId id;

    @MapsId("tareaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tarea", nullable = false)
    private Tarea tarea;

    @MapsId("docenteId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_docente", nullable = false)
    private Docente docente;

    public DocenteTarea() {
    }

    public DocenteTareaId getId() {
        return id;
    }

    public void setId(DocenteTareaId id) {
        this.id = id;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}