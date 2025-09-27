package com.pietro.hexagonal_mybatis.adapters.outbound.persistence.batismapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pietro.hexagonal_mybatis.adapters.outbound.persistence.entities.PessoaEntity;

// Estou usando XML para alimentar os métodos!

@Mapper
public interface PessoaBatisMapper {

    List<PessoaEntity> findAll();

    PessoaEntity findById(Long id);

    // salvar nao retorna nada
    void savePessoa(PessoaEntity pessoaEntity);

    void updatePessoa(PessoaEntity pessoaEntity);

    void deletePessoa(Long id);

}
