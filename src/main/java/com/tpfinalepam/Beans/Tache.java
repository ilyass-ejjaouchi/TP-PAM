package com.tpfinalepam.Beans;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private Date dateCreation;
     private Date dateLimite;

    @OneToMany(mappedBy = "tache")
    List<Participation> participations;
}
