package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.BibliotecarioEntity;
import com.biblioteca.semana09.repository.BibliotecarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioEntity salvarBibliotecario(BibliotecarioEntity bibliotecario) {

        return bibliotecarioRepository.save(bibliotecario);
    }

    public List<BibliotecarioEntity> listatTodos() {

        return bibliotecarioRepository.findAll();
    }

    public void deletarBibliotecario(Long id) {
        bibliotecarioRepository.deleteById(id);
    }
}
