package com.example.main;

import com.example.entities.Magazin;
import jakarta.persistence.Persistence;

import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        try (var emf = Persistence.createEntityManagerFactory("java2c5PU")) {
            try (var em = emf.createEntityManager()) {

                var m = new Magazin();

                m.setDepartamente(Map.of(
                        10,"Vanzari",
                        20, "Suport"
                ));

                em.getTransaction().begin();
                em.persist(m);
                em.getTransaction().commit();
            }
        }

    }

}
