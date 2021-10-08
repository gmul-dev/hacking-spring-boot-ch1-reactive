//package com.gmul.hackingspringboot.reactive.config;
//
//import com.gmul.hackingspringboot.reactive.domain.blocking.BlockingItemRepository;
//import com.gmul.hackingspringboot.reactive.model.Item;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RepositoryDatabaseLoader {
//
//    @Bean
//    CommandLineRunner initialize(BlockingItemRepository repository) {
//        return args -> {
//            repository.save(new Item("Alf alarm clock", 19));
//            repository.save(new Item("Smurf TV tray", 24.99));
//        };
//    }
//}
