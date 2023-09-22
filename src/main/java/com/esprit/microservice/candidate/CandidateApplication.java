package com.esprit.microservice.candidate;

import com.esprit.microservice.candidate.entities.Candidat;
import com.esprit.microservice.candidate.repositories.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }

    @Autowired
    private CandidatRepository repository;
    @Bean
    ApplicationRunner init(){
        return (args)->{
            repository.save(new Candidat("Mohamed","ch","mohamed.ss@email.com"));
            repository.save(new Candidat("sarra","ch","sarra.ss@email.com"));
            repository.save(new Candidat("mouhib","saleh","saleh.ss@email.com"));
            repository.findAll().forEach(System.out::println);
        };
    }
}
