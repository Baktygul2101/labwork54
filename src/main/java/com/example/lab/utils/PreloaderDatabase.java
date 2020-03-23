package com.example.lab.utils;


import com.example.lab.model.Event;
import com.example.lab.model.Subscription;
import com.example.lab.repository.EventRepo;
import com.example.lab.repository.SubsRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class PreloaderDatabase {
    @Bean
    CommandLineRunner init(EventRepo eventRepo) {
        eventRepo.deleteAll();
              return (args) -> Stream.of(events())
                .peek(System.out::println)
                .forEach(eventRepo::save);
    }


    private Event[] events() {
        return new Event[]{
                new Event("1", null, "carantin","stay at home"),
                new Event("2", null, "study","study hard")};
    }
    @Bean
    CommandLineRunner init2(SubsRepo subsRepo) {
        subsRepo.deleteAll();
        return (args) -> Stream.of(subscriptions())
                .peek(System.out::println)
                .forEach(subsRepo::save);
    }
    private Subscription[] subscriptions() {
        return new Subscription[]{
                new Subscription("1", null, "bema@mail.ru",null),
                new Subscription("2", null, "serik@gmail.com",null)};
    }
}