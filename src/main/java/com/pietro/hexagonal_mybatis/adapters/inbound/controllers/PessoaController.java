package com.pietro.hexagonal_mybatis.adapters.inbound.controllers;


import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pietro.hexagonal_mybatis.adapters.dtos.entrada.PessoaRequestDto;
import com.pietro.hexagonal_mybatis.adapters.dtos.saida.PessoaResponseDto;
import com.pietro.hexagonal_mybatis.adapters.mapper.PessoaStructMapper;
import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import com.pietro.hexagonal_mybatis.core.ports.PessoaServicePort;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaServicePort pessoaServicePort;
    private final PessoaStructMapper pessoaStructMapper;

    public PessoaController(PessoaServicePort pessoaServicePort, PessoaStructMapper pessoaStructMapper) {
        this.pessoaServicePort = pessoaServicePort;
        this.pessoaStructMapper = pessoaStructMapper;
    }

    @GetMapping
    public ResponseEntity<List<PessoaResponseDto>> findAll() {
        List<PessoaResponseDto> pessoaResponseDtoList = pessoaStructMapper.domainListToDtoList(pessoaServicePort.findAll());
        return ResponseEntity.ok(pessoaResponseDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseDto> getMethodName(@PathVariable Integer id) {
        PessoaResponseDto pessoaResponseDto = pessoaStructMapper.domainToDto(pessoaServicePort.findById(id));
        return ResponseEntity.ok(pessoaResponseDto);
    }

    @PostMapping
    public ResponseEntity<PessoaResponseDto> postMethodName(@RequestBody PessoaRequestDto pessoaRequestDto) {
        PessoaDomain pessoaDomain = pessoaStructMapper.dtoToDomain(pessoaRequestDto);
        PessoaResponseDto pessoaResponseDto = pessoaStructMapper.domainToDto(pessoaServicePort.savePessoa(pessoaDomain));
        return ResponseEntity.ok(pessoaResponseDto);
    }
    

}