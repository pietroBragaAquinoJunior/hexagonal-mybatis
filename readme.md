Conclusão: Cheguei à conclusão que o myBatis é inviável. Simplesmente eu queria calcular a pontuação de uma pessoa baseada no número de livros que essa pessoa possui (Relacionamento one to many simples). Para eu conseguir carregar o Set de livros dentro da pessoa e fugir do problema de n+1 eu preciso manualmente
declarar no xml um mapper para que o mybatis entenda onde colocar cada retorno do sql. Isso fica custoso não só de fazer como de dar manutenção. Se eu acrescentar qualquer valor ao livro ou a pessoa eu teria que ir no xml novamente e alterar não só a consulta quanto o mapeamento. No JPA isso é mil vezes, cem mil vezes mais fácil pois ele mapeia esses livros para esse set que está em pessoa automaticamente.

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