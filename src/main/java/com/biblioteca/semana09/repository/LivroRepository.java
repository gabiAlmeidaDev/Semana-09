package com.biblioteca.semana09.repository;

import com.biblioteca.semana09.entites.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}
