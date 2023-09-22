package com.esprit.microservice.candidate.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CandidatRestAPI {
     private String title="hello , im the candidate micro-service";

     @RequestMapping("/hello")
     public String sayHello(){
         System.out.println(title);
         return title;
     }
}
