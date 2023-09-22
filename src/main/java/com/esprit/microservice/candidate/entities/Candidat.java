package com.esprit.microservice.candidate.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Candidat implements Serializable {
    private static final long serialVersionUID =6 ;
            @Id
            @GeneratedValue
            private int id ;
    private String nom,prenom,email;
    public Candidat(String nom){
         super();
         this.nom = nom ;
    }
    public Candidat(String nom,String prenom,String email){
        super();
        this.nom = nom ;
        this.prenom = prenom ;
        this.email = email ;
    }

}
