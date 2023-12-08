package com.confiedy.app.repository;

import com.confiedy.app.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

    @Query(value = "SELECT d from DocenteCurso dc join "+
            "Docente d on dc.docente.id = d.id WHERE dc.curso.id = :cursoId")
    List<Docente> findDocentesByCursoId(Integer cursoId);
}