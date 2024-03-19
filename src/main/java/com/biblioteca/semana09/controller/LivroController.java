package com.biblioteca.semana09.controller;

import com.biblioteca.semana09.entites.LivroEntity;
import com.biblioteca.semana09.service.LivroService;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class LivroController {

    @Getter
    public class LivroRequest {
        private String titulo;
        private String autor;
        private Integer anoPublicacao;
    }

    @PostMapping("/livros")
    public LivroEntity adicionarLivro(@RequestBody LivroRequest livroRequest) {
        LivroEntity livro = new LivroEntity(
                livroRequest.getTitulo(),
                livroRequest.getAutor(),
                livroRequest.getAnoPublicacao()
        );
        LivroService livroService = null;
        return livroService.salvarLivro(livro);
    }



}
