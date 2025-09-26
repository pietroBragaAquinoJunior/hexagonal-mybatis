package com.pietro.hexagonal_mybatis.adapters.outbound.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pietro.hexagonal_mybatis.adapters.mapper.PessoaStructMapper;
import com.pietro.hexagonal_mybatis.adapters.outbound.persistence.batismapper.PessoaBatisMapper;
import com.pietro.hexagonal_mybatis.adapters.outbound.persistence.entities.PessoaEntity;
import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import com.pietro.hexagonal_mybatis.core.ports.PessoaPersistencePort;

@Repository
public class PessoaPersistencePortImpl implements PessoaPersistencePort {

    private final PessoaBatisMapper pessoaBatisMapper;
    private final PessoaStructMapper pessoaStructMapper;

    public PessoaPersistencePortImpl(PessoaBatisMapper pessoaBatisMapper, PessoaStructMapper pessoaStructMapper) {
        this.pessoaBatisMapper = pessoaBatisMapper;
        this.pessoaStructMapper = pessoaStructMapper;
    }

    @Override
    public List<PessoaDomain> findAll() {
        return pessoaStructMapper.entityListToDomainList(pessoaBatisMapper.findAll());
    }

    @Override
    public PessoaDomain findById(Integer id) {
        return pessoaStructMapper.entityToDomain(pessoaBatisMapper.findById(id));
    }

    @Override
    public PessoaDomain savePessoa(PessoaDomain pessoaDomain) {
        PessoaEntity pessoaEntity = pessoaStructMapper.domainToEntity(pessoaDomain);  

        // myBatis preenche automaticamente essa entidade.
        pessoaBatisMapper.savePessoa(pessoaEntity);

        return pessoaStructMapper.entityToDomain(pessoaEntity);
    }

}