package com.pietro.hexagonal_mybatis.core.services;

import java.util.List;

import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import com.pietro.hexagonal_mybatis.core.ports.PessoaPersistencePort;
import com.pietro.hexagonal_mybatis.core.ports.PessoaServicePort;


public class PessoaServicePortImpl implements PessoaServicePort {

    private final PessoaPersistencePort pessoaPersistencePort;

    public PessoaServicePortImpl(PessoaPersistencePort pessoaPersistencePort) {
        this.pessoaPersistencePort = pessoaPersistencePort;
    }

    public List<PessoaDomain> findAll() {
        return pessoaPersistencePort.findAll();
    }

    @Override
    public PessoaDomain findById(Integer id) {
        return pessoaPersistencePort.findById(id);
    }

}