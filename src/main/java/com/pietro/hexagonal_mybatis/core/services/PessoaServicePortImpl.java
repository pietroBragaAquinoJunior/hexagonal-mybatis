package com.pietro.hexagonal_mybatis.core.services;

import java.util.List;

import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import com.pietro.hexagonal_mybatis.core.ports.PessoaPersistencePort;
import com.pietro.hexagonal_mybatis.core.ports.PessoaServicePort;


public class PessoaServicePortImpl implements PessoaServicePort {

    private final PessoaPersistencePort repository;

    public PessoaServicePortImpl(PessoaPersistencePort repository) {
        this.repository = repository;
    }

    public List<PessoaDomain> listarTodos() {
        return repository.findAll();
    }
}