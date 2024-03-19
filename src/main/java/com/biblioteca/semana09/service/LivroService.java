package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.LivroEntity;
import com.biblioteca.semana09.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    public LivroEntity salvarLivro(LivroEntity livro) {

        return livroRepository.save(livro);
    }

    public List<LivroEntity> listarTodosLivros() {
        return livroRepository.findAll();
    }
}
