package com.biblioteca.semana09.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BibliotecarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bibliotecarioId;
    @NotNull
    private String nome;
    private String email;
    @NotNull
    private String senha;

}
