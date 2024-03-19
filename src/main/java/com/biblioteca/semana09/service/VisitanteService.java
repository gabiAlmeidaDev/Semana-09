package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.VisitanteEntity;
import com.biblioteca.semana09.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository visitanteRepository;

    public VisitanteEntity salvarVisitante(VisitanteEntity visitante) {

        return visitanteRepository.save(visitante);
    }
}
