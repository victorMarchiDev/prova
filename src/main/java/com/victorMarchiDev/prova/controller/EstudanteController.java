package com.victorMarchiDev.prova.controller;

import com.victorMarchiDev.prova.model.Estudante;
import com.victorMarchiDev.prova.service.EstudanteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    private final EstudanteService service;

    public EstudanteController(EstudanteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Estudante> criarUsuario(@RequestBody Estudante estudante){
        service.criarEstudante(estudante);
        return ResponseEntity.ok().body(estudante);
    }

    @GetMapping
    public List<Estudante> listarEstudantes(){
        return service.listarEstudantes();
    }

    @GetMapping("/{id}")
    public Optional<Estudante> buscarPorId(@PathVariable Long id){
        Optional<Estudante> resultado = service.listarPorId(id);
        return resultado;
    }

    @DeleteMapping("/{id}")
    public HttpStatus deletarPorId(@PathVariable Long id){
        service.deletarPorId(id);
        return HttpStatus.valueOf(204);
    }
}
