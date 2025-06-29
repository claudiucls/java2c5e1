package com.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Fisier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nume;

    @ElementCollection
    private List<String> linii;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<String> getLinii() {
        return linii;
    }

    public void setLinii(List<String> linii) {
        this.linii = linii;
    }
}
