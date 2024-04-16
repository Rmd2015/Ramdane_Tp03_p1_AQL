package org.example.Exercice1;

public class UserService    {

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private UserRepository userRepository ;
    public UserService( UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public Utilisateur getUserById(long id){
        return this.userRepository.findUserById(id);
    }


}
