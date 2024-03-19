package com.biblioteca.semana09.repository;

import com.biblioteca.semana09.entites.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembrosRepository extends JpaRepository<MembrosEntity, Long> {
}
