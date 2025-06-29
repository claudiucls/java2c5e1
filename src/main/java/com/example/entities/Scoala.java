package com.example.entities;

import jakarta.persistence.*;

import java.util.Map;

@Entity
public class Scoala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "tabela_materii")
    @MapKeyClass(String.class) //se specifica tipul key
    @MapKeyColumn(name="nume_profesor") // configuram coloana pentru stocarea cheii mapului
    private Map<String, Materie> materii;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Materie> getMaterii() {
        return materii;
    }

    public void setMaterii(Map<String, Materie> materii) {
        this.materii = materii;
    }
}
