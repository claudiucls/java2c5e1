package com.example.main;


import com.example.entities.Fisier;
import com.example.entities.Folder;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (var emf = Persistence.createEntityManagerFactory("java2c5PU")) {
            try (var em = emf.createEntityManager()) {

                Fisier fisier1 = new Fisier();
                fisier1.setNume("X");
                fisier1.setLinii(List.of("linia X 1","linia X 2"));

                Fisier fisier2 = new Fisier();
                fisier2.setNume("Y");
                fisier2.setLinii(List.of("linia Y 1","linia Y 2","linia Y 3"));

                Folder folder = new Folder();
                folder.setName("A");
                folder.setFisiere(List.of(fisier1,fisier2));

                em.getTransaction().begin();
                em.persist(folder);
                em.getTransaction().commit();


            }
        }


    }
}