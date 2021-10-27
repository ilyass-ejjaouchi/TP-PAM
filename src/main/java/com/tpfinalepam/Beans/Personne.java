package com.tpfinalepam.Beans;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;

    @OneToMany(mappedBy = "personne")
    List<Participation> participations;
}
