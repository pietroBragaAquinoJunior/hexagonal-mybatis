package com.pietro.hexagonal_mybatis.core.ports;

import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import java.util.List;

public interface PessoaServicePort {

    List<PessoaDomain> findAll();

    PessoaDomain findById(Integer id);
    
    PessoaDomain savePessoa(PessoaDomain pessoaDomain);
}