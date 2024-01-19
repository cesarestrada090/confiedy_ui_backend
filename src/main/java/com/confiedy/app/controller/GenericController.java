package com.confiedy.app.controller;
import com.confiedy.app.dto.DocenteDto;
import com.confiedy.app.dto.CursoPorUniversidadDto;
import com.confiedy.app.dto.DocentePorCursoDto;
import com.confiedy.app.dto.UniversidadDto;
import com.confiedy.app.service.CursoService;
import com.confiedy.app.service.DocenteService;
import com.confiedy.app.service.UniversidadService;
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
    private final UniversidadService universidadService;
    private static final Logger log = Logger.getLogger(GenericController.class.getName());
    @Autowired
    public GenericController(final CursoService cursoService,
                             final DocenteService docenteService,
                             final UniversidadService universidadService) {
        this.cursoService = cursoService;
        this.docenteService = docenteService;
        this.universidadService = universidadService;
    }

    @GetMapping(value="docente/curso/{id}")
    public ResponseEntity<List<DocentePorCursoDto>> getDocentesPorCurso(
            @PathVariable(name = "id") Integer id){
        List<DocentePorCursoDto> docentePorCursoDtos;
        try {
            docentePorCursoDtos = docenteService.getDocentesByCurso(id);
        } catch (Exception e){
            log.info("Excepcion en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(docentePorCursoDtos, HttpStatus.OK);
    }

    @GetMapping(value="docente")
    public ResponseEntity<List<DocenteDto>> getAllDocentes(){
        try {
            List<DocenteDto> cursoDtoList = docenteService.getAll();
            return ResponseEntity.ok(cursoDtoList);
        } catch (Exception e){
            log.info("Exception en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value="universidad")
    public ResponseEntity<List<UniversidadDto>> getAllUniversidades(){
        try {
            List<UniversidadDto> universidadDtos = universidadService.getAll();
            return ResponseEntity.ok(universidadDtos);
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

    @GetMapping(value="curso")
    public ResponseEntity<List<CursoPorUniversidadDto>> getAllCursos(){
        try {
            List<CursoPorUniversidadDto> cursoPorUniversidadDtos = cursoService.getAllCursos();
            return ResponseEntity.ok(cursoPorUniversidadDtos);
        } catch (Exception e){
            log.info("Exception en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
