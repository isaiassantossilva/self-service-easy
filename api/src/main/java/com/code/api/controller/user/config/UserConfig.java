package com.code.api.controller.user.config;

import cryptpassword.CryptPasswordMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ports.driven.CryptPasswordPort;
import ports.driven.UserRepositoryPort;
import ports.driver.CreateNewUserPort;
import repository.RepositoryMock;
import userstories.CreateNewUserUS;

@Configuration
public class UserConfig {

    @Bean
    public CreateNewUserPort createNewUserPort(UserRepositoryPort userRepositoryPort,
                                             CryptPasswordPort cryptPasswordPort){
        return new CreateNewUserUS(userRepositoryPort, cryptPasswordPort);
    }

    @Bean
    UserRepositoryPort userRepositoryPort(){
        return new RepositoryMock();
    }

    @Bean
    CryptPasswordPort cryptPasswordPort(){
        return new CryptPasswordMock();
    }
}
