package com.pietro.hexagonal_mybatis.adapters.outbound.persistence.batismapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.pietro.hexagonal_mybatis.adapters.outbound.persistence.entities.PessoaEntity;

@Mapper
public interface PessoaBatisMapper {
    @Select("SELECT * FROM pessoas")
    List<PessoaEntity> findAll();
}
