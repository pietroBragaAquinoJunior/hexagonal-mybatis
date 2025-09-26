package com.pietro.hexagonal_mybatis.adapters.inbound.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import com.pietro.hexagonal_mybatis.core.ports.PessoaServicePort;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaServicePort service;

    public PessoaController(PessoaServicePort service) {
        this.service = service;
    }

    @GetMapping
    public List<PessoaDomain> listarTodos() {
        return service.listarTodos();
    }
}