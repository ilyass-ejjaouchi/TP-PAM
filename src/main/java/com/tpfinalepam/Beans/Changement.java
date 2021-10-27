package com.tpfinalepam.Beans;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

@Entity
@Data
public class Changement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;
    private Enum etats;

    @Column(unique = true)
    @OneToMany(mappedBy = "changement" +
            "" +
            "")
    List<Participation> participations;
}
