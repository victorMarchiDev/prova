package com.victorMarchiDev.prova.service;

import com.victorMarchiDev.prova.model.Estudante;
import com.victorMarchiDev.prova.repository.EstudanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    private final EstudanteRepository repo;

    public EstudanteService(EstudanteRepository repo) {
        this.repo = repo;
    }

    public Estudante criarEstudante(Estudante estudante){
        return repo.save(estudante);
    }

    public List<Estudante> listarEstudantes(){
        return repo.findAll();
    }

    public Optional<Estudante> listarPorId(Long id){
        Optional<Estudante> estudanteResgatado = repo.findById(id);
        return estudanteResgatado;
    }

    public void deletarPorId(Long id){
        repo.deleteById(id);
    }
}
