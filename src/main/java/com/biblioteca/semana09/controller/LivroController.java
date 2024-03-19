package com.biblioteca.semana09.controller;

import com.biblioteca.semana09.entites.LivroEntity;
import com.biblioteca.semana09.service.LivroService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
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

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroEntity> listarTodosLivros() {

        return livroService.listarTodosLivros();
    }

    @DeleteMapping("/livros/{id}")
    public ResponseEntity<?> deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
        return ResponseEntity.ok().build();
    }

}
