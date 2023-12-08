package com.confiedy.app.service.impl;

import com.confiedy.app.entities.Curso;
import com.confiedy.app.entities.Universidad;
import com.confiedy.app.util.MapperUtil;
import com.confiedy.app.dto.UniversidadDto;
import com.confiedy.app.repository.UniversidadRepository;
import com.confiedy.app.service.UniversidadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UniversidadServiceImpl implements UniversidadService {

    private final UniversidadRepository universidadRepository;
    private final ModelMapper mapper;

    @Autowired
    public UniversidadServiceImpl(final UniversidadRepository universidadRepository,final ModelMapper mapper) {
        this.universidadRepository = universidadRepository;
        this.mapper = mapper;
    }

    @Override
    public List<UniversidadDto> getAll(){
        List<Universidad> universidadList = universidadRepository.findAll();
        return  universidadList.stream().map( x-> mapper.map(x,UniversidadDto.class)).collect(Collectors.toList());
    }

}
