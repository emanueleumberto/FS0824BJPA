package org.example;

import org.example.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Main 
{

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoMavenDB");
    private static EntityManager em = emf.createEntityManager();

    public static void main( String[] args ) {


        User utente = new User("Mario", "Rossi", 25, "Roma", "m.rossi@example.com", "12345");
        save(utente);

        em.close();
        emf.close();
    }

    public static void save(User u) {
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }
}
