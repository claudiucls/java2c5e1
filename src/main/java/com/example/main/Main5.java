package com.example.main;

import com.example.entities.Persoana;
import jakarta.persistence.Persistence;

public class Main5 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("java2c5PU");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

        Persoana persoana = em.find(Persoana.class, 1);

        System.out.println(persoana.getAdrese());

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
