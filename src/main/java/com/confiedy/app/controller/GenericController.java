package com.confiedy.app.controller;
import com.confiedy.app.dto.DocenteDto;
import com.confiedy.app.dto.CursoPorUniversidadDto;
import com.confiedy.app.service.CursoService;
import com.confiedy.app.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/app")
public class GenericController {
    private final CursoService cursoService;
    private final DocenteService docenteService;
    private static final Logger log = Logger.getLogger(GenericController.class.getName());
    @Autowired
    public GenericController(final CursoService cursoService, final DocenteService docenteService) {
        this.cursoService = cursoService;
        this.docenteService = docenteService;
    }

    @GetMapping(value="docente/curso/{id}")
    public ResponseEntity<List<CursoPorUniversidadDto>> getDocentesPorCurso(
            @PathVariable(name = "id") Integer id){
        List<CursoPorUniversidadDto> cursoPorUniversidadDtos;
        try {
            cursoPorUniversidadDtos = cursoService.getCursosPorUniversidad(id);
        } catch (Exception e){
            log.info("Excepcion en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(cursoPorUniversidadDtos, HttpStatus.OK);
    }

    @GetMapping(value="docente")
    public ResponseEntity<List<DocenteDto>> getAll(){
        try {
            List<DocenteDto> cursoDtoList = docenteService.getAll();
            return ResponseEntity.ok(cursoDtoList);
        } catch (Exception e){
            log.info("Exception en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value="curso/universidad/{id}")
    public ResponseEntity<List<CursoPorUniversidadDto>> getAll(@PathVariable(name = "id") Integer id){
        try {
            List<CursoPorUniversidadDto> cursoPorUniversidadDtos = cursoService.getCursosPorUniversidad(id);
            return ResponseEntity.ok(cursoPorUniversidadDtos);
        } catch (Exception e){
            log.info("Exception en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
