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
@AllArgsConstructor
public class MembrosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long membrosId;
    private String nome;
    private String endereço;
    private String telefone;
}
