package com.victorMarchiDev.prova.repository;

import com.victorMarchiDev.prova.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
