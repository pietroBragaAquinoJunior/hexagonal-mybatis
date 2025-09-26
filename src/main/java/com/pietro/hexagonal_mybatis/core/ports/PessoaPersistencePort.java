package com.pietro.hexagonal_mybatis.core.ports;

import java.util.List;

import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;

public interface PessoaPersistencePort {

    List<PessoaDomain> findAll();

    PessoaDomain findById(Integer id);
}