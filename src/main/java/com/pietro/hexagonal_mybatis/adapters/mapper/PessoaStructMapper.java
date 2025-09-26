package com.pietro.hexagonal_mybatis.adapters.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.pietro.hexagonal_mybatis.adapters.outbound.persistence.entities.PessoaEntity;
import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;

@Mapper(componentModel = "spring")
public interface PessoaStructMapper {

    PessoaDomain toDomain(PessoaEntity entity);

    List<PessoaDomain> toDomainList(List<PessoaEntity> entities);

    PessoaEntity toEntity(PessoaDomain domain);

    List<PessoaEntity> toEntityList(List<PessoaDomain> domains);
}