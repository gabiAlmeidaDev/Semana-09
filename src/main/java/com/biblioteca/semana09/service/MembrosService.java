package com.biblioteca.semana09.service;

import com.biblioteca.semana09.entites.MembrosEntity;
import com.biblioteca.semana09.repository.MembrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembrosService {

    @Autowired
    private MembrosRepository membrosRepository;

    public MembrosEntity salvarMembro(MembrosEntity membro) {

        return membrosRepository.save(membro);
    }
}
