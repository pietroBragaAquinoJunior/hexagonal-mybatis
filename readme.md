ESTRUTURA

src/main/java/com/exemplo/pessoas
    ├── application
    │    └── service
    │         └── PessoaService.java
    │
    ├── domain
    │    ├── model
    │    │    └── Pessoa.java
    │    └── repository
    │         └── PessoaRepository.java
    │
    ├── infrastructure
    │    ├── config
    │    │    └── MyBatisConfig.java
    │    ├── persistence
    │    │    ├── mapper
    │    │    │    └── PessoaMapper.java
    │    │    ├── entity
    │    │    │    └── PessoaEntity.java
    │    │    ├── repository
    │    │    │    └── PessoaRepositoryImpl.java
    │    │    └── mapstruct
    │    │         └── PessoaEntityMapper.java
    │    │
    │    └── rest
    │         └── PessoaController.java
    │
    └── PessoasApplication.java
