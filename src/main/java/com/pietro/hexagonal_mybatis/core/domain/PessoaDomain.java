package com.pietro.hexagonal_mybatis.core.domain;

public class PessoaDomain {
    private Long id;
    private String nome;
    private int idade;

    

    public PessoaDomain() {
    }

    public PessoaDomain(Long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

 
}