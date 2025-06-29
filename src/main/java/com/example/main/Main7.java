package com.example.main;

import com.example.entities.Persoana;
import jakarta.persistence.Cache;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main7 {

    public static void main(String[] args) {

        try (var emf = Persistence.createEntityManagerFactory("java2c5PU")) {

            Cache cache = emf.getCache();
            // rezultatul nu este cel asteptat pentru ca Hibernate recunoaste
            // aplicatia de tip standAlone si dezactiveaza cache-ul


            boolean contains = cache.contains(Persistence.class, 1);
            // verifica daca exista instanta cu PK 1
            System.out.println(contains); // initial nu exista in cache - false

            try (var em1 = emf.createEntityManager()) {
                Persoana p1 = em1.find(Persoana.class, 1);
                System.out.println(cache.contains(Persoana.class, 1));
                // odata facut find instanta de persoana 1 va exista in cache (true)
            }
            try (var em2 = emf.createEntityManager()) {
                Persoana p2 = em2.find(Persoana.class, 1);
                System.out.println(cache.contains(Persoana.class, 1));
            }

//            cache.evict(Persoana.class); //sterge din cache toate instantele de persoana
//                                    // sau unor clase care mostenesc Persoana
//            cache.evict(Persoana.class, 1); // sterge din cache Persoana cu id=ul 1
//                                                // nu merge pentru clasele ce mostenesc Persoana
//            cache.evictAll(); // sterge toate elementele din cache
//

        }
    }
}
