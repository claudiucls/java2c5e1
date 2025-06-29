package com.example.entities;

import jakarta.persistence.*;

import java.util.Map;

@Entity
public class Persoana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.PERSIST)
    @MapKey(name = "strada") // numele coloane din adresa
                            // din care va lua valore pentru care
                            // o va pune drept keye asociata respectivei adresa
    private Map<String, Adresa> adrese;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Adresa> getAdrese() {
        return adrese;
    }

    public void setAdrese(Map<String, Adresa> adrese) {
        this.adrese = adrese;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", adrese=" + adrese +
                '}';
    }
}
