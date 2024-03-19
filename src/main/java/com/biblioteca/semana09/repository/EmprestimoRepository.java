package com.biblioteca.semana09.repository;

import com.biblioteca.semana09.entites.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Modifying
    @Query("UPDATE Emprestimo e SET e.dataDevolucao = :dataDevolucao WHERE e.id = :id")
    @Transactional
    void atualizaDataDevolucao(@Param("id") Long id, @Param("dataDevolucao") LocalDate dataDevolucao);
}
