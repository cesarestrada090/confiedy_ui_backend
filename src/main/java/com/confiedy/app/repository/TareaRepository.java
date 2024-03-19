package com.confiedy.app.repository;

import com.confiedy.app.entities.Docente;
import com.confiedy.app.entities.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TareaRepository extends JpaRepository<Docente, Integer> {

    @Query(value = "SELECT t from DocenteTarea dt join "+
            "Tarea t on dt.tarea.id = t.id WHERE dt.docente.id = :docenteId")
    List<Tarea> findTareasByDocente(Integer docenteId);
}