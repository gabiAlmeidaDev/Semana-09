package com.biblioteca.semana09.controller;


import com.biblioteca.semana09.entites.BibliotecarioEntity;
import com.biblioteca.semana09.service.BibliotecarioService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {

    @Getter
    public class BibliotecarioRequest {
        private String nome;
        private String email;
        private String senha;
    }

    @PostMapping("/bibliotecarios")
    public BibliotecarioEntity adicionarBibliotecario(@RequestBody BibliotecarioController.BibliotecarioRequest bibliotecarioRequest) {

        return new BibliotecarioEntity();
    }

    @Autowired
    private BibliotecarioService bibliotecarioService;

    @GetMapping
    public List<BibliotecarioEntity> listarTodosBibliotecarios() {

        return bibliotecarioService.listatTodos();
    }

    @DeleteMapping("/bibliotecarios/{id}")
    public ResponseEntity<?> deletarBibliotecario(@PathVariable Long id) {
        bibliotecarioService.deletarBibliotecario(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/bibliotecarios/{id}")
    public ResponseEntity<BibliotecarioEntity> atualizarBibliotecario(@PathVariable Long id,
                                                                      @RequestBody BibliotecarioRequest bibliotecarioRequest) {
        bibliotecarioService.updateBibliotecario(bibliotecarioRequest.getNome(),
                                                 bibliotecarioRequest.getEmail(),
                                                 bibliotecarioRequest.getSenha(),
                                                 id);
        return ResponseEntity.ok().build();
    }

}
