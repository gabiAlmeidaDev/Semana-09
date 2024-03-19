package com.biblioteca.semana09.repository;

import com.biblioteca.semana09.entites.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MembrosRepository extends JpaRepository<MembrosEntity, Long> {

    @Modifying
    @Query("UPDATE Membro m SET m.nome = :nome, " +
           "m.endereco = :endereco, " +
           "m.telefone = :telefone WHERE m.id = :id")
    void updateMembro(@Param("nome") String nome,
                      @Param("endereco") String endereco,
                      @Param("telefone") String telefone,
                      @Param("id") Long id);

}
