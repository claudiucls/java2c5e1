package com.example.main;

import com.example.entities.Adresa;
import com.example.entities.Persoana;
import jakarta.persistence.Persistence;

import java.util.Map;

public class Main4 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("java2c5PU");
        var em = emf.createEntityManager();

        Adresa a1 = new Adresa();
        a1.setStrada("Bd-ul Timisoara");
        a1.setNumar(4);

        Adresa a2 = new Adresa();
        a2.setStrada("Bd-ul 1 Mai");
        a2.setNumar(10);

        Persoana p1 = new Persoana();
        p1.setAdrese(Map.of(
                a1.getStrada(), a1,
                a2.getStrada(), a2
        ));

        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        em.close();
        emf.close();


    }
}
