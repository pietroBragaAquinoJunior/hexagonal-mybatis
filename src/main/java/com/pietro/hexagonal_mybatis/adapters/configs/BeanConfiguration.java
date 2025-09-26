package com.pietro.hexagonal_mybatis.adapters.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pietro.hexagonal_mybatis.HexagonalMybatisApplication;
import com.pietro.hexagonal_mybatis.core.ports.PessoaPersistencePort;
import com.pietro.hexagonal_mybatis.core.services.PessoaServicePortImpl;

@Configuration
@ComponentScan(basePackageClasses = HexagonalMybatisApplication.class)
public class BeanConfiguration {

    @Bean
    PessoaServicePortImpl pessoaServicePortImpl(PessoaPersistencePort pessoaPersistencePort) {
        return new PessoaServicePortImpl(pessoaPersistencePort);
    }

}

