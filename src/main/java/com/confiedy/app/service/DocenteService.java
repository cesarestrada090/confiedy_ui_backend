package com.confiedy.app.service;

import com.confiedy.app.dto.DocenteDto;
import com.confiedy.app.dto.DocentePorCursoDto;

import java.util.List;

public interface DocenteService {
    List<DocenteDto> getAll();
    List<DocentePorCursoDto> getDocentesByCurso(Integer cursoId);
}
