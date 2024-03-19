package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.EmprestimoEntity;
import com.biblioteca.semana09.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public EmprestimoEntity salvarEmprestimo(EmprestimoEntity emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public List<EmprestimoEntity> listarTodosEmprestimos() {
        return emprestimoRepository.findAll();
    }

    public Optional<EmprestimoEntity> buscarEmprestimoPorId(Long id) {
        return emprestimoRepository.findById(id);
    }

    public void deletarEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }

    public void atualizarDataDevolucao(Long id, LocalDate dataDevolucao) {
        emprestimoRepository.atualizaDataDevolucao(id, dataDevolucao);
    }
}

