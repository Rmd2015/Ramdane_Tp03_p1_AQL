package Exercice1;
import org.example.Exercice1.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.mockito.Mockito.*;

public class UserServiceTest {


    @Test
    public void getUserByIdTest(){
        UserRepository userRepository = mock(UserRepository.class);
        long userId = 123;
        Utilisateur user = new Utilisateur(userId,"r","d","mqile");
        // injecter le mock !
        UserService userService = new UserService(userRepository);
        //a cause on n'a pas encore l'cces au bdd on va mocké le userRepository
        when(userRepository.findUserById(userId)).thenReturn(user);

        Utilisateur utilisateur = (userService.getUserById(123));

        Assertions.assertEquals(utilisateur,user);





    }
}
