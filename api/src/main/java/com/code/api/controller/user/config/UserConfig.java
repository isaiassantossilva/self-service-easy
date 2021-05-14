package com.code.api.controller.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ports.driven.UserRepositoryPort;
import repository.RepositoryMock;
import userstories.CreateNewUserUS;

@Configuration
public class UserConfig {

    @Bean
    public CreateNewUserUS createNewUserUS(){
        return new CreateNewUserUS(userRepositoryPort());
    }

    private UserRepositoryPort userRepositoryPort(){
        return new RepositoryMock();
    }
}
