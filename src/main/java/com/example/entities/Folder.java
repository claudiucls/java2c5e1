package com.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Fisier> fisiere;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fisier> getFisiere() {
        return fisiere;
    }

    public void setFisiere(List<Fisier> fisiere) {
        this.fisiere = fisiere;
    }
}
