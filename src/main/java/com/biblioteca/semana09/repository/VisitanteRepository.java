package com.biblioteca.semana09.repository;

import com.biblioteca.semana09.entites.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Modifying
    @Query(value = "UPDATE visitante SET nome = :nome, " +
                   "telefone = :telefone WHERE id = :id", nativeQuery = true)
    void updateVisitante(@Param("nome") String nome,
                         @Param("telefone") String telefone,
                         @Param("id") Long id);


}
