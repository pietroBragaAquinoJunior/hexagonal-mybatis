package com.pietro.hexagonal_mybatis.adapters.outbound.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pietro.hexagonal_mybatis.adapters.mapper.PessoaStructMapper;
import com.pietro.hexagonal_mybatis.adapters.outbound.persistence.batismapper.PessoaBatisMapper;
import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import com.pietro.hexagonal_mybatis.core.ports.PessoaPersistencePort;

@Repository
public class PessoaPersistencePortImpl implements PessoaPersistencePort {

    private final PessoaBatisMapper batisMapper;
    private final PessoaStructMapper structMapper;

    public PessoaPersistencePortImpl(PessoaBatisMapper mapper, PessoaStructMapper entityMapper) {
        this.batisMapper = mapper;
        this.structMapper = entityMapper;
    }

    @Override
    public List<PessoaDomain> findAll() {
        return structMapper.toDomainList(batisMapper.findAll());
    }
}