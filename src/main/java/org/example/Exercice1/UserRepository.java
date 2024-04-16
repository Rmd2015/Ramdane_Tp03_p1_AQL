package org.example.Exercice1;

import java.util.HashMap;

public interface UserRepository {
    //crud to database
    public Utilisateur findUserById(long id);
}
