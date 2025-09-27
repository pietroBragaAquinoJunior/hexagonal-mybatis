package com.pietro.hexagonal_mybatis.adapters.outbound.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivroEntity {
    private Long id;
    private String titulo;
    private Long pessoaId; 
}