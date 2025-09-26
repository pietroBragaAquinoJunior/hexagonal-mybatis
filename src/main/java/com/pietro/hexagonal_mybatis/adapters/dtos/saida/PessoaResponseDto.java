package com.pietro.hexagonal_mybatis.adapters.dtos.saida;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PessoaResponseDto {
    private Long id;
    private String nome;
    private int idade;
}