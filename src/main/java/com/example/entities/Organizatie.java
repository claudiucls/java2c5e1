package com.example.entities;

import jakarta.persistence.*;

import java.util.Map;

@Entity
public class Organizatie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    private Map<Adresa, String> straziAdrese;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Adresa, String> getStraziAdrese() {
        return straziAdrese;
    }

    public void setStraziAdrese(Map<Adresa, String> straziAdrese) {
        this.straziAdrese = straziAdrese;
    }
}
