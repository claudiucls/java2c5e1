package com.example.main;

import com.example.entities.Adresa;
import com.example.entities.Organizatie;
import jakarta.persistence.Persistence;

import java.util.Map;

public class Main6 {

    public static void main(String[] args) {
        try (var emf = Persistence.createEntityManagerFactory("java2c5PU")) {
            try (var em = emf.createEntityManager()) {

                Adresa a1 = new Adresa();
                a1.setStrada("bd-ul Basarab");
                a1.setNumar(5);

                Organizatie o = new Organizatie();
                o.setStraziAdrese(Map.of(
                        a1, a1.getStrada()
                ));

                em.getTransaction().begin();
                em.persist(a1);
                em.persist(o);
                em.getTransaction().commit();
            }
        }
    }
}
