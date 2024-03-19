package com.biblioteca.semana09.repository;

import com.biblioteca.semana09.entites.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Modifying
    @Query("UPDATE Livro l SET " +
           "l.titulo = :titulo, " +
           "l.autor = :autor, " +
           "l.anoPublicacao = :anoPublicacao WHERE l.id = :id")
    void updateLivro(@Param("titulo") String titulo,
                     @Param("autor") String autor,
                     @Param("anoPublicacao") Integer anoPublicacao,
                     @Param("id") Long id);


}
