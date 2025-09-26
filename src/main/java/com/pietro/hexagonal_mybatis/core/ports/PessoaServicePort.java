package com.pietro.hexagonal_mybatis.core.ports;

import com.pietro.hexagonal_mybatis.core.domain.PessoaDomain;
import java.util.List;

public interface PessoaServicePort {
    public List<PessoaDomain> listarTodos();
}