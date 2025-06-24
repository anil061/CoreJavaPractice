package Ecommerce;

import java.util.List;

public interface ICategory {
    int getId();
    String getName();
    List<Product> getProducts();

    void addProduct(Product product);
}
