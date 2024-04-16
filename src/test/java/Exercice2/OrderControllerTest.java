package Exercice2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.example.Exercice2.*;

import static org.mockito.Mockito.*;

public class OrderControllerTest {

    @Test
    public void createOrderSucessTest(){
        // Création des mocks
        OrderService orderService = mock(OrderService.class);
        Order order = new Order();
     //   OrderService orderService = new OrderService(orderDao);
        OrderController orderController = new OrderController(orderService);
        //assure que le retour de la méthode createOrder soit True !
        when(orderController.createOrder(order)).thenReturn(true);
        //appele a la méthode cible !
         boolean create = orderController.createOrder(order);
        // Vérification des appels de méthodes
        verify(orderService).createOrder(order); // Vérifie si OrderService.createOrder a été appelé avec le bon argument
        // Création des mocks
        // separe les mocks car on peut pas utilser deux mock a la fois !!!
        OrderDao orderDao = mock(OrderDao.class);
        OrderService orderServicee = new OrderService(orderDao);
        //assure que le retour de la méthode createOrder soit True !
        when(orderServicee.createOrder(order)).thenReturn(true);
        boolean cr = orderServicee.createOrder(order);
        verify(orderDao).saveOrder(order); // Vérifie si OrderDao.saveOrder a été appelé avec l'objet de commande créé

    }
    @Test
    public void createOrderFailerTest(){
        // Création des mocks
        OrderService orderService = mock(OrderService.class);
        Order order = new Order();
        //   OrderService orderService = new OrderService(orderDao);
        OrderController orderController = new OrderController(orderService);
        //assure que le retour de la méthode createOrder soit false !
        when(orderController.createOrder(order)).thenReturn(false);
        //appele a la méthode cible !
        boolean create = orderController.createOrder(order);
        // Vérification des appels de méthodes
        verify(orderService).createOrder(order); // Vérifie si OrderService.createOrder a été appelé avec le bon argument
        // Création des mocks
        // separe les mocks car on peut pas utilser deux mock a la fois !!!
        OrderDao orderDao = mock(OrderDao.class);
        OrderService orderServicee = new OrderService(orderDao);
        //assure que le retour de la méthode createOrder soit false !
        when(orderServicee.createOrder(order)).thenReturn(false);
        boolean cr = orderServicee.createOrder(order);
        verify(orderDao).saveOrder(order); // Vérifie si OrderDao.saveOrder a été appelé avec l'objet de commande créé

    }
}
