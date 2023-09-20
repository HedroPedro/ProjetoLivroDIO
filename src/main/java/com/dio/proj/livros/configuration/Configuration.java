package com.dio.proj.livros.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public <T> List<T> list(){
        return new ArrayList<T>();
    }
}
