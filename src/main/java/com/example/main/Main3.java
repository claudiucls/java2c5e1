package com.example.main;

import com.example.entities.Materie;
import com.example.entities.Scoala;
import jakarta.persistence.Persistence;

import java.util.Map;

public class Main3 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("java2c5PU");
        var em  = emf.createEntityManager();

        var s = new Scoala();
        s.setMaterii(Map.of(
                "dl. prof. Ghita", Materie.MATE,
                "dl. prof. Ion", Materie.INFO,
                "dna. prof. Georgescu", Materie.LATINA
        ));

        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
