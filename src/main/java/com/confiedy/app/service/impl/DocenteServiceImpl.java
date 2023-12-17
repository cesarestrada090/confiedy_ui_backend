package com.confiedy.app.service.impl;

import com.confiedy.app.dto.DocenteDto;
import com.confiedy.app.dto.DocentePorCursoDto;
import com.confiedy.app.entities.Curso;
import com.confiedy.app.entities.Docente;
import com.confiedy.app.repository.CursoRepository;
import com.confiedy.app.repository.DocenteRepository;
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
    private final ModelMapper mapper;

    @Autowired
    public DocenteServiceImpl(final DocenteRepository docenteRepository, final ModelMapper mapper, final CursoRepository cursoRepository) {
        this.docenteRepository = docenteRepository;
        this.cursoRepository = cursoRepository;
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
            DocentePorCursoDto docentePorCursoDto = new DocentePorCursoDto();
            docentePorCursoDto.setCurso(c.getNombre());
            docentePorCursoDto.setDocenteId(d.getId());
            docentePorCursoDto.setId(d.getId());
            docentePorCursoDto.setDescripcion(d.getDescripcion());
            docentePorCursoDto.setCursoId(c.getId());
            docentePorCursoDto.setDocente(d.getNombre());
            docentePorCursoDto.setImagenPerfil(d.getImagenPerfil());
            docentePorCursoDto.setNumeroEstrellas(d.getNumeroEstrellas());
            docentePorCursoDto.setNumeroHorasDictadas(d.getHorasDictadas());
            docentePorCursoDtoList.add(docentePorCursoDto);
        }
        return docentePorCursoDtoList;
    }

}
