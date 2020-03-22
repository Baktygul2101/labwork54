package com.example.lab.utils;


import com.example.lab.repository.EventRepo;
import com.example.lab.repository.SubsRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreloaderDatabase {
    @Bean
    CommandLineRunner init(EventRepo eventRepo, SubsRepo subsRepo) {
        return (args) -> {
            eventRepo.deleteAll();
            subsRepo.deleteAll();
        };
    }
}