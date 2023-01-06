package br.com.doistech.api.config;

import br.com.doistech.api.Repositories.UserRepository;
import br.com.doistech.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(0, "Brenno", "brenno@gmail.com", "123234");
        User u2 = new User(0, "Dayane", "dayane@gmail.com", "123234");

        repository.saveAll(List.of(u1, u2));
    }
}
