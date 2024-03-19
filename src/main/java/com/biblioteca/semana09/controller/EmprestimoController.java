package com.biblioteca.semana09.controller;

import com.biblioteca.semana09.entites.EmprestimoEntity;
import com.biblioteca.semana09.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping
    public ResponseEntity<EmprestimoEntity> criarEmprestimo(@RequestBody EmprestimoEntity emprestimo) {
        EmprestimoEntity novoEmprestimo = emprestimoService.salvarEmprestimo(emprestimo);
        return ResponseEntity.ok(novoEmprestimo);
    }

    @GetMapping
    public ResponseEntity<List<EmprestimoEntity>> listarTodosEmprestimos() {
        List<EmprestimoEntity> emprestimos = emprestimoService.listarTodosEmprestimos();
        return ResponseEntity.ok(emprestimos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmprestimoEntity> buscarEmprestimoPorId(@PathVariable Long id) {
        return emprestimoService.buscarEmprestimoPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEmprestimo(@PathVariable Long id) {
        emprestimoService.deletarEmprestimo(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/devolucao")
    public ResponseEntity<Void> atualizarDataDevolucao(@PathVariable Long id, @RequestBody LocalDate dataDevolucao) {
        emprestimoService.atualizarDataDevolucao(id, dataDevolucao);
        return ResponseEntity.ok().build();
    }
}

