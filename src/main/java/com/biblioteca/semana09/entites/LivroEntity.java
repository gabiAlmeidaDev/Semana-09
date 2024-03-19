package com.biblioteca.semana09.entites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor

public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long livroId;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public LivroEntity(String titulo, String autor, Integer anoPublicacao) {
    }

}
