package com.biblioteca.semana09.controller;

import com.biblioteca.semana09.entites.MembrosEntity;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembrosController {

    @Getter
    public class MembrosRequest {
        private String nome;
        private String endereço;
        private String telefone;
    }

    @PostMapping("/membros")
    public MembrosEntity adicionarMembro(@RequestBody MembrosController.MembrosRequest membrosRequest) {
        MembrosEntity membro = new MembrosEntity();

        return membro;
    }
}
