package com.biblioteca.semana09.entites;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Table(name = "livro")
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor

public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long livroId;
    @NotNull
    private String titulo;
    private String autor;
    private Integer anoPublicacao;


    public LivroEntity(String titulo, String autor, Integer anoPublicacao) {
    }

}
