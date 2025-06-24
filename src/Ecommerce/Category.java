package Ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category implements  ICategory{
    private int id;
    private String name;
    private List<Product> products;

    public Category(int id, String name){
        this.id = id;
        this.name = name;
        this.products = new ArrayList<>();
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        if(!products.contains(product)){
            products.add(product);
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.products = listOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;
        return getId() == category.getId() && Objects.equals(getName(), category.getName()) && Objects.equals(products, category.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), products);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listOfProducts=" + products +
                '}';
    }

}
