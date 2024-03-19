package com.biblioteca.semana09.controller;


import com.biblioteca.semana09.entites.BibliotecarioEntity;
import com.biblioteca.semana09.service.BibliotecarioService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
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
}
