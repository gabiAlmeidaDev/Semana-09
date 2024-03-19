package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.MembrosEntity;
import com.biblioteca.semana09.repository.MembrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MembrosService {

    @Autowired
    private MembrosRepository membrosRepository;

    public MembrosEntity salvarMembro(MembrosEntity membro) {

        return membrosRepository.save(membro);
    }

    public List<MembrosEntity> listarTodos() {
        return membrosRepository.findAll();
    }

    public void deletarMembro(Long id) {
        membrosRepository.deleteById(id);
    }

    @Transactional
    public void updateMembro(String nome,
                             String endereco,
                             String telefone,
                             Long id) {
        membrosRepository.updateMembro(nome, endereco, telefone, id);
    }
}
