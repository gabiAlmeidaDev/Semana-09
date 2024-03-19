package com.biblioteca.semana09.controller;


import com.biblioteca.semana09.entites.BibliotecarioEntity;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibliotecarioController {

    @Getter
    public class BibliotecarioRequest {
        private String nome;
        private String email;
        private String senha;
    }


    @PostMapping("/bibliotecario")
    public BibliotecarioEntity adicionarBibliotecario(@RequestBody BibliotecarioController.BibliotecarioRequest bibliotecarioRequest) {
        BibliotecarioEntity membro = new BibliotecarioEntity();

        return membro;
    }
}
