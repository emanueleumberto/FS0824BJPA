package org.example;

import org.example.entities.Address;
import org.example.entities.Passport;
import org.example.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class Main 
{

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoMavenDB");
    private static EntityManager em = emf.createEntityManager();

    public static void main( String[] args ) {

        Address a = new Address("Roma", "Marconi", "RM", 1, "Lazio");
        Address b = new Address("Roma", "Tiburtina", "RM", 18, "Lazio");

        User utente1 = new User("Mario", "Rossi", 25, "m.rossi@example.com", "12345", a);
        //User utente2 = new User("Giuseppe", "Verdi", 31, "Milano", "g.verdi@example.com", "12345");
        User utente3 = new User("Francesca", "Neri", 25, "f.neri@example.com", "12345", b);
        //User utente4 = new User("Antonio", "Gialli", 44, "Palermo", "a.gialli@example.com", "12345");
        //User utente5 = new User("Luigi", "Grigio", 55, "Napoli", "g.grigio@example.com", "12345");

        //User u = find(1);
        //Passport p1 = new Passport("AB123", LocalDate.now(), "Roma", u);
        //savePassport(p1);


    //save(utente1);
        //save(utente2);
        //save(utente3);
        //save(utente4);
        //save(utente5);
        //
        //System.out.println(u);
        //remove(u);

        em.close();
        emf.close();
    }

    public static void savePassport(Passport p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public static void save(User u) {
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }

    public static User find(long id) {
        em.getTransaction().begin();
        User u = em.find(User.class, id);
        em.getTransaction().commit();
        return u;
    }

    public static void remove(User u) {
        em.getTransaction().begin();
        em.remove(u);
        em.getTransaction().commit();
    }
}
