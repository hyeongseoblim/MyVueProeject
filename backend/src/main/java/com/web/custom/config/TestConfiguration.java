package com.web.custom.config;


import com.web.custom.repo.BookRepository;
import com.web.custom.repo.TestBookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("test")
public class TestConfiguration {
//
//    @Bean
//    public BookRepository bookRepo(){
//        return new TestBookRepository();
//    }
}
