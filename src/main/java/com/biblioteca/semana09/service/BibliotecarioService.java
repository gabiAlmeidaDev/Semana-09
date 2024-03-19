package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.BibliotecarioEntity;
import com.biblioteca.semana09.repository.BibliotecarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioEntity salvarBibliotecario(BibliotecarioEntity bibliotecario) {

        return bibliotecarioRepository.save(bibliotecario);
    }
}