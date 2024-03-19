package com.confiedy.app.service.impl;

import com.confiedy.app.dto.DocenteDto;
import com.confiedy.app.dto.DocentePorCursoDto;
import com.confiedy.app.dto.TareaDto;
import com.confiedy.app.entities.Curso;
import com.confiedy.app.entities.Docente;
import com.confiedy.app.entities.Tarea;
import com.confiedy.app.repository.CursoRepository;
import com.confiedy.app.repository.DocenteRepository;
import com.confiedy.app.repository.TareaRepository;
import com.confiedy.app.service.DocenteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocenteServiceImpl implements DocenteService {

    private final DocenteRepository docenteRepository;
    private final CursoRepository cursoRepository;
    private final TareaRepository tareaRepository;
    private final ModelMapper mapper;

    @Autowired
    public DocenteServiceImpl(final DocenteRepository docenteRepository, final ModelMapper mapper, final CursoRepository cursoRepository,final TareaRepository tareaRepository) {
        this.docenteRepository = docenteRepository;
        this.cursoRepository = cursoRepository;
        this.tareaRepository = tareaRepository;
        this.mapper = mapper;
    }

    @Override
    public List<DocenteDto> getAll(){
        List<Docente> docenteList = docenteRepository.findAll();
        return  docenteList.stream().map( x-> mapper.map(x,DocenteDto.class)).collect(Collectors.toList());
    }

    public List<DocentePorCursoDto> getDocentesByCurso(Integer cursoId){
        List<Docente> docenteCursoList = docenteRepository.findDocentesByCursoId(cursoId);
        Curso c = cursoRepository.getReferenceById(cursoId);
        List<DocentePorCursoDto> docentePorCursoDtoList = new ArrayList<>();
        for (Docente d: docenteCursoList){
            List<TareaDto> tareaDtoList = new ArrayList<>();
            DocentePorCursoDto docentePorCursoDto = new DocentePorCursoDto();
            docentePorCursoDto.setCurso(c.getNombre());
            docentePorCursoDto.setDocenteId(d.getId());
            docentePorCursoDto.setNumeroCalificaciones(d.getNumeroCalificaciones());
            docentePorCursoDto.setId(d.getId());
            docentePorCursoDto.setDescripcion(d.getDescripcion());
            docentePorCursoDto.setCursoId(c.getId());
            docentePorCursoDto.setDocente(d.getNombre());
            docentePorCursoDto.setImagenPerfil(d.getImagenPerfil());
            docentePorCursoDto.setNumeroEstrellas(d.getNumeroEstrellas());
            docentePorCursoDto.setNumeroHorasDictadas(d.getHorasDictadas());
            List<Tarea> tareas = tareaRepository.findTareasByDocente(docentePorCursoDto.getDocenteId());
            for (Tarea t: tareas){
                TareaDto tareaDto = new TareaDto();
                tareaDto.setDescripcion(t.getDescripcion());
                tareaDtoList.add(tareaDto);
            }
            docentePorCursoDto.setTareas(tareaDtoList);
            docentePorCursoDtoList.add(docentePorCursoDto);
        }
        return docentePorCursoDtoList;
    }

}
