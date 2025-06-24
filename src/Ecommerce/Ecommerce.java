package Ecommerce;

import java.util.Map;

public class Ecommerce {
    public static void main(String[] args) {
        Product p1 = new Product(1, "product1", 96);
        Product p2 = new Product(2, "product2", 15);
        Product p3 = new Product(3, "product3", 164);
        Product p4 = new Product(4, "product4", 26);
        Product p5 = new Product(5, "product5", 195);
        Product p6 = new Product(6, "product6", 0);

        Category category1 = new Category(1, "Category1");
        category1.addProduct(p1);
        category1.addProduct(p2);
        category1.addProduct(p4);
        category1.addProduct(p5);
        category1.addProduct(p6);

        Category category2 = new Category(2, "Category2");
        category2.addProduct(p2);

        Category category3 = new Category(3, "Category3");
        category3.addProduct(p3);
        category3.addProduct(p4);
        category3.addProduct(p5);

        Company company = new Company(101, "MyECom");
        company.addCategory(category1);
        company.addCategory(category2);
        company.addCategory(category3);

        System.out.println("Top category by product count: " + company.getTopCategoryNameByProductCount());

        System.out.println("\nProducts belonging to multiple categories:");
        for (Product p : company.getProductBelongingToMultipleCategories()) {
            System.out.println(p.getName());
        }

        System.out.println("\nSum of product prices by category:");
        company.printCategorySums();

        Map.Entry<String, Double> topValueCategory = company.getTopCategoryBySumOfProductPrices();
        System.out.println("\nMost valuable category: " + topValueCategory.getKey() + " " + topValueCategory.getValue());
    }
}

