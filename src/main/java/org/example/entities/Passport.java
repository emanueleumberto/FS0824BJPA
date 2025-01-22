package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "passaporti")
public class Passport {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, unique = true)
    private String numero;
    @Column(nullable = false)
    private LocalDate dataEmissione;
    @Column(nullable = false)
    private String luogoEmissione;

    @OneToOne
    @JoinColumn(name = "utente_id")
    private User utente;

    public Passport() {}

    public Passport(String numero, LocalDate dataEmissione, String luogoEmissione, User utente) {
        this.numero = numero;
        this.dataEmissione = dataEmissione;
        this.luogoEmissione = luogoEmissione;
        this.utente = utente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(LocalDate dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public String getLuogoEmissione() {
        return luogoEmissione;
    }

    public void setLuogoEmissione(String luogoEmissione) {
        this.luogoEmissione = luogoEmissione;
    }

    public User getUtente() {
        return utente;
    }

    public void setUtente(User utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", dataEmissione=" + dataEmissione +
                ", luogoEmissione='" + luogoEmissione + '\'' +
                ", utente=" + utente +
                '}';
    }
}
