package com.confiedy.app.service;


import com.confiedy.app.dto.DocentePorCursoDto;
import com.confiedy.app.dto.CursoPorUniversidadDto;
import com.confiedy.app.entities.Curso;

import java.util.List;

public interface CursoService {
    List<CursoPorUniversidadDto> getCursosPorUniversidad(Integer universidadId);

    List<CursoPorUniversidadDto> getAllCursos();

}
