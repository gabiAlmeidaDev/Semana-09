package com.biblioteca.semana09.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emprestimoId;
    private Livro livro;
    private Membros membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;





}
