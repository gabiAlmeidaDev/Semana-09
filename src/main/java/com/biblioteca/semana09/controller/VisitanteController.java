package com.biblioteca.semana09.controller;

import com.biblioteca.semana09.entites.VisitanteEntity;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitanteController {

    @Getter
    public class VisitanteRequest {
        private String nome;
        private String telefone;
    }

    @PostMapping("/visitantes")
    public VisitanteEntity adicionarVisitante(@RequestBody VisitanteRequest visitanteRequest) {
        VisitanteEntity visitante = new VisitanteEntity(
        );

        return visitante;
    }
}
