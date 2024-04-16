package Exercice3;

import org.example.Exercice3.*;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.testng.Assert.*;

public class ProductServiceTest {
    @Test
    public void getProductRecuperationReussieTest(){
        // Création des mocks
        ProductApiClient productApiClient = mock(ProductApiClient.class);
        ProductService productService = new ProductService(productApiClient);
        //si getproduct appele return Product("voiture","12",2530)
        when(productApiClient.getProduct("12")).thenReturn(new Product("voiture","12",2530));
        Product p = productService.getProduct("12");
        verify(productApiClient).getProduct("12");

        // Vérifier que le produit retourné est celui attendu
        assertNotNull(p);
        assertEquals("12", p.getId());
        assertEquals("voiture", p.getNom());
    }

    @Test
    public void getProductFormatincompatibleTest(){
        // Création des mocks
        ProductApiClient productApiClient = mock(ProductApiClient.class);
        ProductService productService = new ProductService(productApiClient);
        //si getproduct appele return exception!!
        // Définir le comportement du mock pour simuler un format de données incompatible
        when(productApiClient.getProduct("12")).thenThrow(new DataFormatExcept());
        // Appeler la méthode getProduct avec un ID de produit valide
        assertThrows(DataFormatExcept.class, () -> productService.getProduct("12"));
        // Vérifier que le mock a été appelé avec le bon argument
        verify(productApiClient).getProduct("12");
    }

    @Test
    public void getProductEchecsAppelAPITest(){
        // Création des mocks
        ProductApiClient productApiClient = mock(ProductApiClient.class);
        ProductService productService = new ProductService(productApiClient);
        when(productApiClient.getProduct("12")).thenThrow(new APIException());

        assertThrows(APIException.class, () -> productService.getProduct("12"));
        // Vérifier que le mock a été appelé avec le bon argument
        verify(productApiClient).getProduct("12");




    }
}
