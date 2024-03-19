package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.LivroEntity;
import com.biblioteca.semana09.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    public LivroEntity salvarLivro(LivroEntity livro) {

        return livroRepository.save(livro);
    }
}
