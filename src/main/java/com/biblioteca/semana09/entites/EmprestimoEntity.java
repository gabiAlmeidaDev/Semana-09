package com.biblioteca.semana09.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmprestimoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emprestimoId;
    @NotNull
    private LivroEntity livro;
    @NotNull
    private MembrosEntity membro;
    @NotNull
    private LocalDate dataEmprestimo;
    @NotNull
    private LocalDate dataDevolucao;





}
