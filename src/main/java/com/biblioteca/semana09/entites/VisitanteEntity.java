package com.biblioteca.semana09.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor

public class VisitanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long visitanteId;
    private String nome;
    private String telefone;

    public VisitanteEntity(Long visitanteId, String nome, String telefone) {
        this.visitanteId = visitanteId;
        this.nome = nome;
        this.telefone = telefone;
    }
}
