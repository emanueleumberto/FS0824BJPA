package org.example.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aziende")
public class Azienda {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "azienda")
    private List<User> dipendenti;

}
