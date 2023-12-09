package com.confiedy.app.service.impl;

import com.confiedy.app.dto.CursoPorUniversidadDto;
import com.confiedy.app.entities.Curso;
import com.confiedy.app.repository.CursoRepository;
import com.confiedy.app.service.CursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {
    private final CursoRepository cursoRepository;
    private final ModelMapper mapper;
    @Autowired
    public CursoServiceImpl(final CursoRepository cursoRepository,
                            final ModelMapper mapper) {
        this.cursoRepository = cursoRepository;
        this.mapper = mapper;
    }

    public List<CursoPorUniversidadDto> getCursosPorUniversidad(Integer universidadId){
        List<Curso> cursos = cursoRepository.getCursosByUniversidad(universidadId);
        List<CursoPorUniversidadDto> cursoPorUniversidadList= new ArrayList<>();
        for (Curso c: cursos){
            CursoPorUniversidadDto cursoPorUniversidadDto = new CursoPorUniversidadDto();
            cursoPorUniversidadDto.setCurso(c.getNombre());
            cursoPorUniversidadDto.setId(c.getId());
            cursoPorUniversidadDto.setCodigoCurso(c.getCodigo());
            cursoPorUniversidadDto.setCiclo(c.getCiclo());
            cursoPorUniversidadDto.setUniversidadId(c.getUniversidad().getId());
            cursoPorUniversidadDto.setImagenCurso(c.getImagenCurso());
            cursoPorUniversidadDto.setNombreUniversidad(c.getUniversidad().getNombre());
            cursoPorUniversidadDto.setDuracion(c.getDuracion());
            cursoPorUniversidadDto.setCiclo(c.getCiclo());
            cursoPorUniversidadDto.setDescripcion(c.getDescripcion());
            cursoPorUniversidadDto.setMaximoEstudiantes(c.getMaximoEstudiantes());
            cursoPorUniversidadList.add(cursoPorUniversidadDto);
        }
        return cursoPorUniversidadList;
    }
}
