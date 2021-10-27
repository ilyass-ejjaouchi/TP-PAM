package com.tpfinalepam.Beans;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    Tache tache;

    @ManyToOne
    Changement changement;

    @ManyToOne
    Role role;

    @ManyToOne
    Personne personne;
}
