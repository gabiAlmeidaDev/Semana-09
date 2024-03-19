package com.biblioteca.semana09.repository;


import com.biblioteca.semana09.entites.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Modifying
    @Query("UPDATE Bibliotecario b SET b.nome = :nome, " +
           "b.email = :email, " +
           "b.senha = :senha WHERE b.id = :id")
    void updateBibliotecario(@Param("nome") String nome,
                             @Param("email") String email,
                             @Param("senha") String senha,
                             @Param("id") Long id);

}
