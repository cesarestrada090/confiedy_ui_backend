package com.confiedy.app.repository;

import com.confiedy.app.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    @Query("SELECT c from Curso c JOIN Universidad u ON c.universidad.id = u.id " +
            "WHERE u.id = :universidadId")
    List<Curso> getCursosByUniversidad(Integer universidadId);
}