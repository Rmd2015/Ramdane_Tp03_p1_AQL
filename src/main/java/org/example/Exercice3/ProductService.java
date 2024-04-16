package org.example.Exercice3;

public class ProductService {
    private ProductApiClient productApiClient;

    public ProductService(ProductApiClient productApiClient) {
        this.productApiClient = productApiClient;
    }

    public Product getProduct(String productId){
        return this.productApiClient.getProduct(productId);

    }
}
