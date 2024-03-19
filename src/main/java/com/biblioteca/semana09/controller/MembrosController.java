package com.biblioteca.semana09.controller;

import com.biblioteca.semana09.entites.MembrosEntity;
import com.biblioteca.semana09.service.MembrosService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
public class MembrosController {

    @Getter
    @AllArgsConstructor
    public class MembrosRequest {
        private String nome;
        private String endereço;
        private String telefone;

        public String getEndereco() {
            return null;
        }
    }

    @PostMapping("/membros")
    public MembrosEntity adicionarMembro(@RequestBody MembrosController.MembrosRequest membrosRequest) {

        return new MembrosEntity();
    }

    @Autowired
    private MembrosService membrosService;

    @GetMapping
    public List<MembrosEntity> listarTodosMembros() {

        return membrosService.listarTodos();
    }

    @DeleteMapping("/membros/{id}")
    public ResponseEntity<?> deletarMembro(@PathVariable Long id) {
        membrosService.deletarMembro(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/membros/{id}")
    public ResponseEntity<MembrosEntity> atualizarMembro(@PathVariable Long id,
                                                         @RequestBody MembrosRequest membroRequest) {
        membrosService.updateMembro(membroRequest.getNome(),
                                    membroRequest.getEndereco(),
                                    membroRequest.getTelefone(),
                                    id);
        return ResponseEntity.ok().build();
    }
}
