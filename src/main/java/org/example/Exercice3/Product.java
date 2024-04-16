package org.example.Exercice3;

public class Product {


    private String nom,id;

    private float prix;

    public Product(String nom, String id, float prix) {
        this.nom = nom;
        this.id = id;
        this.prix = prix;
    }
    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }

    public float getPrix() {
        return prix;
    }



}
