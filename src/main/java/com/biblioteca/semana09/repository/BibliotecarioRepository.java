package com.biblioteca.semana09.repository;


import com.biblioteca.semana09.entites.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
