package org.example.Exercice1;

public class Utilisateur {
    private String  nom, prenom ,mail ;
    private long id;

    public Utilisateur(long id,String nom, String prenom, String mail) {
        this.nom = nom ;
        this.prenom = prenom;
        this.mail = mail ;
        this.id = id;
    }
}
