package org.example.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "corsi")
public class Courses {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "listaCorsi")
    private List<User> partecipanti = new ArrayList<User>();

}
