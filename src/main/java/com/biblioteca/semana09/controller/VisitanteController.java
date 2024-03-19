package com.biblioteca.semana09.controller;

import com.biblioteca.semana09.entites.VisitanteEntity;
import com.biblioteca.semana09.service.VisitanteService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

    @Getter
    public class VisitanteRequest {
        private String nome;
        private String telefone;
    }

    @PostMapping("/visitantes")
    public VisitanteEntity adicionarVisitante(@RequestBody VisitanteRequest visitanteRequest) {

        return new VisitanteEntity(
        );
    }

    @Autowired
    public VisitanteService visitanteService;

    @GetMapping
    public List<VisitanteEntity> listarTodosVisitantes() {

        return visitanteService.listarTodos();
    }

    @DeleteMapping("/visitantes/{id}")
    public ResponseEntity<?> deletarVisitante(@PathVariable Long id) {
        visitanteService.deletarVisitante(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/visitantes/{id}")
    public ResponseEntity<VisitanteEntity> atualizarVisitante(@PathVariable Long id,
                                                              @RequestBody VisitanteRequest visitanteRequest) {
        visitanteService.updateVisitante(visitanteRequest.getNome(),
                                         visitanteRequest.getTelefone(),
                                         id);
        return ResponseEntity.ok().build();
    }

}
