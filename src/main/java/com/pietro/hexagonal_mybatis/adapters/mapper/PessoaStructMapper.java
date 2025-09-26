package com.pietro.hexagonal_mybatis.adapters.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.pietro.hexagonal_mybatis.adapters.dtos.entrada.PessoaRequestDto;
import com.pietro.hexagonal_mybatis.adapters.dtos.entrada.PessoaRequestUpdateDto;
import com.pietro.hexagonal_mybatis.adapters.dtos.saida.PessoaResponseDto;
import com.pietro.hexagonal_mybatis.adapters.outbound.persistence.entities.PessoaEntity;
import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;

@Mapper(componentModel = "spring")
public interface PessoaStructMapper {

    // domain | entity ===============

    PessoaDomain entityToDomain(PessoaEntity entity);

    List<PessoaDomain> entityListToDomainList(List<PessoaEntity> entities);

    PessoaEntity domainToEntity(PessoaDomain domain);

    List<PessoaEntity> domainListToEntityList(List<PessoaDomain> domains);

    // domain | dto ===================

    // domain ~> response

    PessoaResponseDto domainToDto(PessoaDomain pessoaDomain);

    List<PessoaResponseDto> domainListToDtoList(List<PessoaDomain> pessoaDomainList);

    // request ~> domain

    @Mapping(target = "id", ignore = true )
    PessoaDomain dtoToDomain(PessoaRequestDto pessoaRequestDto);

    List<PessoaDomain> dtoListToDomainList(List<PessoaRequestDto> pessoaRequestDtoList);

    // outros

    PessoaDomain updateDtoToDomain(PessoaRequestUpdateDto pessoaRequestUpdateDto);

}